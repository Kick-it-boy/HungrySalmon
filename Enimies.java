import java.awt.*;

public class Enimies {
    Image img;
    int x;
    int y;
    int width;
    int height;
    int speed;
    int dir = 1;
    int count;

    int level;

    public void paintSelf(Graphics graphics){
        graphics.drawImage(img,x,y,width,height,null);

    }
    public Rectangle getRec(){
        return new Rectangle(x,y,width,height);
    }
    public void deleteSelf(){
        this.x = -600;
        this.y = -600;
    }

}
class Enimies_1_L extends Enimies{
    Enimies_1_L(){
        this.x = -45;
        this.y = (int) (Math.random() * 700 + 100);
        this.width = 60;
        this.height = 36;
        this.speed = 30;
        this.count = 1;
        this.img = BackGr.enimies_1;
        this.level = 1;
    }
}

class Enimies_1_R extends Enimies_1_L{
    Enimies_1_R(){
        this.x = 1700;
        this.dir = -1;
        this.img = BackGr.enimies_1_R;
    }
}

class Enimies_2_L extends Enimies_1_L{
    Enimies_2_L(){
        this.width = 56;
        this.img = BackGr.enimies_2;
    }
}

class Enimies_2_R extends Enimies_2_L{
    Enimies_2_R(){
        this.x = 1700;
        this.dir = -1;
        this.img = BackGr.enimies_2_R;
    }
}


class Enimies_3_L extends Enimies_1_L{
    Enimies_3_L(){
        this.width = 65;
        this.height = 31;
        this.img = BackGr.enimies_3;
    }
}

class Enimies_3_R extends Enimies_3_L{
    Enimies_3_R(){
        this.x = 1700;
        this.dir = -1;
        this.img = BackGr.enimies_3_R;
    }
}

class Salmon_EL extends Enimies{
    Salmon_EL(){
        this.x = -500;
        this.y = (int) (Math.random() * 700 + 100);
        this.width = 350;
        this.height = 125;
        this.speed = 30;
        this.count = 5;
        this.img = BackGr.salmon_EL;
        this.level = 2;
    }

    public Rectangle getRec(){
        return new Rectangle(x+30,y+50,width-80,height-60);
    }
}

class Salmon_ER extends Salmon_EL{
    Salmon_ER(){
        this.x = 2600;
        this.dir = -1;
        this.img = BackGr.salmon_ER;
    }
}

class Shark_L extends Enimies{
    Shark_L(){
        this.x = -800;
        this.y = (int) (Math.random() * 700 + 100);
        this.width = 600;
        this.height = 270;
        this.speed = 30;
        this.count = 15;
        this.img = BackGr.shark_L;
        this.level = 4;
    }

    public Rectangle getRec(){
        return new Rectangle(x,y,width-80,height-60);
    }
}
class Shark_R extends Shark_L{
    Shark_R(){
        this.x = 2600;
        this.dir = -1;
        this.img = BackGr.shark_R;
    }
}