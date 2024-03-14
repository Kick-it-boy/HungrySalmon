import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Entity {
    void paintSelf(Graphics graphics, int fishLevel){
        graphics.drawImage(BackGr.bg,0,0,null);
        switch (Main.state){
            case 0:
                BackGr.drawWord(graphics, "START", Color.red, 60, 700, 500);
                break;
            case 1:
                BackGr.drawWord(graphics, "Count:" + BackGr.count, Color.red, 50, 120, 100);
                BackGr.drawWord(graphics, "Difficulty:" + BackGr.level, Color.red, 50, 600, 100);
                BackGr.drawWord(graphics, "Level:" + fishLevel, Color.red, 50, 1000, 100);
                break;
            case 2:
                BackGr.drawWord(graphics, "YOU ARE EATEN", Color.red, 60, 700, 500);
                BackGr.drawWord(graphics,"CLICK TO RESTART",Color.red,50,700,600);
                JButton jb1 = new JButton();
                jb1.setBounds(0,0,1600,900);
                jb1.addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(MouseEvent e) {
                        super.mouseClicked(e);
                        if (e.getButton() == 1){
                            Main.reStartGame();
                        }
                    }
                });
                break;
            case 3:
                BackGr.drawWord(graphics, "VICTORY!!!", Color.red, 60, 700, 500);
                BackGr.drawWord(graphics,"CLICK TO RESTART",Color.red,50,700,1000);
                JButton jb2 = new JButton();
                jb2.setBounds(0,0,1600,900);
                jb2.addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(MouseEvent e) {
                        super.mouseClicked(e);
                        if (e.getButton() == 1){
                            Main.reStartGame();
                        }
                    }
                });
                break;
            case 4:
                break;
            default:
        }
    }

}