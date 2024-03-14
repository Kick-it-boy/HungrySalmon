import java.awt.*;

public class MyFish {
    Image img = BackGr.myFish_L;
    int x = 700;
    int y = 500;
    int width = 200;
    int height = 70;
    int speed = 40;
    static int level = 1;


    public void paintSelf(Graphics graphics){
        logic();
        graphics.drawImage(img,x,y,width + 3 * BackGr.count,height + BackGr.count,null);

    }

    public Rectangle getRec(){
        return new Rectangle(x,y,width + 3 * BackGr.count,height+ BackGr.count);
    }

    void logic(){
        if(BackGr.UP){
            if(y >= 0){
                y -= speed;
            }
            else {
                y -= 0;
            }
        }
        if(BackGr.DOWN){
            if (y <= 820){
                y += speed;
            }
            else {
                y += 0;
            }
        }
        if(BackGr.LEFT){
            img = BackGr.myFish_L;
            if (x >= 0){
                x -= speed;
            }
            else {
                x -= 0;
            }
        }
        if(BackGr.RIGHT){
            img = BackGr.myFish_R;
            if (x <= 1520){
                x += speed;
            }
            else {
                x += 0;
            }
        }
    }
}