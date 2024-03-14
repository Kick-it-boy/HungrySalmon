import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Main extends JFrame {
    static int state = 0;
    Image offScreenimage;
    int width = 1600;
    int height = 900;
    Double random;
    int time = 0;

    Entity bGentity = new Entity();
    Enimies enimies ;
    MyFish myFish = new MyFish();
    public void launch(){
        this.setVisible(true);
        this.setSize(width, height);
        this.setLocationRelativeTo(null);
        this.setTitle("Hungry salmon");
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                if (e.getButton() == 1 && state == 0){
                    state = 1;
                    repaint();
                }
            }
        });

        this.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                super.keyPressed(e);
                if(e.getKeyCode()==87){
                    BackGr.UP = true;
                }
                if(e.getKeyCode()==83){
                    BackGr.DOWN = true;
                }
                if(e.getKeyCode()==65){
                    BackGr.LEFT = true;
                }
                if(e.getKeyCode()==68){
                    BackGr.RIGHT = true;
                }
            }
            public void keyReleased(KeyEvent e){
                super.keyReleased(e);
                if(e.getKeyCode()==87){
                    BackGr.UP = false;
                }
                if(e.getKeyCode()==83){
                    BackGr.DOWN = false;
                }
                if(e.getKeyCode()==65){
                    BackGr.LEFT = false;
                }
                if(e.getKeyCode()==68){
                    BackGr.RIGHT = false;
                }
            }
        });

        while (true){
            repaint();
            time++;
            try {
                Thread.sleep(40);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
    public void paint(Graphics g){
        offScreenimage = createImage(width,height);
        Graphics gImage = offScreenimage.getGraphics();
        bGentity.paintSelf(gImage, MyFish.level);


        switch (state){
            case 0:

                break;
            case 1:
                myFish.paintSelf(gImage);
                logic();
                for(Enimies enimies:BackGr.EnimiesList){
                    enimies.paintSelf(gImage);
                }

                break;
            case 2:
                break;
            case 3:
                myFish.paintSelf(gImage);
                break;
            case 4:
                break;
                default:
        }
        g.drawImage(offScreenimage,0,0,null);
    }
    void logic(){
        if(BackGr.count < 20){
            BackGr.level = 0;
            MyFish.level = 1;
        }
        else if(BackGr.count <= 50){
            BackGr.level = 1;
            MyFish.level = 1;
        }
        else if(BackGr.count <= 70){
            BackGr.level = 2;
            MyFish.level = 2;
        }
        else if(BackGr.count <= 100){
            BackGr.level = 3;
            MyFish.level = 3;
        }
        else if(BackGr.count <= 250){
            BackGr.level = 4;
            MyFish.level = 4;
        }
        else {
            state = 3;
        }
        random = Math.random();
        switch (BackGr.level){
            case 4:
                if(time%500 == 0){
                    if(random > 0.5){
                        Enimies enimy = new Salmon_EL();
                        BackGr.EnimiesList.add(enimy);
                    }

                    else {
                        Enimies enimy = new Salmon_ER();
                        BackGr.EnimiesList.add(enimy);
                    }
                }
                if(time%550 == 0){
                    if(random > 0.5){
                        Enimies enimy = new Shark_L();
                        BackGr.EnimiesList.add(enimy);
                    }

                    else {
                        Enimies enimy = new Shark_R();
                        BackGr.EnimiesList.add(enimy);
                    }
                }

            case 3:
                if(time%350 == 0){
                    if(random > 0.5){
                        Enimies enimy = new Salmon_EL();
                        BackGr.EnimiesList.add(enimy);
                    }

                    else {
                        Enimies enimy = new Salmon_ER();
                        BackGr.EnimiesList.add(enimy);
                    }
                }
                if(time%450 == 0){
                    if(random > 0.5){
                        Enimies enimy = new Shark_L();
                        BackGr.EnimiesList.add(enimy);
                    }

                    else {
                        Enimies enimy = new Shark_R();
                        BackGr.EnimiesList.add(enimy);
                    }
                }

            case 2:
                if(time%300 == 0){
                    if(random > 0.5){
                        Enimies enimy = new Shark_L();
                        BackGr.EnimiesList.add(enimy);
                    }

                    else {
                        Enimies enimy = new Shark_R();
                        BackGr.EnimiesList.add(enimy);
                    }
                }

            case 1:
                if(time%200 == 0){
                    if(random > 0.5){
                        Enimies enimy = new Salmon_EL();
                        BackGr.EnimiesList.add(enimy);
                    }

                    else {
                        Enimies enimy = new Salmon_ER();
                        BackGr.EnimiesList.add(enimy);
                    }
                }


            case 0:
                if(time%40 == 0){
                    if(random > 0.5){
                        Enimies enimy = new Enimies_1_L();
                        BackGr.EnimiesList.add(enimy);
                    }

                    else {
                        Enimies enimy = new Enimies_1_R();
                        BackGr.EnimiesList.add(enimy);
                    }
                }
                if(time%60 == 0){
                    if(random > 0.5){
                        Enimies enimy = new Enimies_2_L();
                        BackGr.EnimiesList.add(enimy);
                    }

                    else {
                        Enimies enimy = new Enimies_2_R();
                        BackGr.EnimiesList.add(enimy);
                    }
                }
                if(time%80 == 0){
                    if(random > 0.5){
                        Enimies enimy = new Enimies_3_L();
                        BackGr.EnimiesList.add(enimy);
                    }

                    else {
                        Enimies enimy = new Enimies_3_R();
                        BackGr.EnimiesList.add(enimy);
                    }
                }

            break;
            default:
        }


        for(Enimies enimies:BackGr.EnimiesList){
            enimies.x += enimies.dir*enimies.speed;
            if(myFish.getRec().intersects(enimies.getRec())){
                if(MyFish.level >= enimies.level){
                    enimies.deleteSelf();
                    BackGr.count += enimies.count;
                }
                else {
                    Main.state = 2;
                }

            }
        }

    }

    static void reStartGame(){
        BackGr.bg = Toolkit.getDefaultToolkit().createImage("material/Sea/sea.jpg");
        BackGr.EnimiesList.clear();
        BackGr.count = 0;
        state = 0;
    }
    public static void main(String[] args) {
    Main Game = new Main();
    Game.launch();
    }
}