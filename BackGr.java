import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class BackGr {

    static boolean UP = false;
    static boolean DOWN = false;
    static boolean LEFT = false;
    static boolean RIGHT = false;
    public static List<Enimies>EnimiesList = new ArrayList<>();
    public static Image bg = Toolkit.getDefaultToolkit().createImage("material/Sea/sea.jpg");
    public static Image enimies_1 = Toolkit.getDefaultToolkit().createImage("material/Seafoods/fish1_L.png");
    public static Image enimies_1_R = Toolkit.getDefaultToolkit().createImage("material/Seafoods/fish1_R.png");
    public static Image enimies_2 = Toolkit.getDefaultToolkit().createImage("material/Seafoods/fish2_L.png");
    public static Image enimies_2_R = Toolkit.getDefaultToolkit().createImage("material/Seafoods/fish2_R.png");
    public static Image enimies_3 = Toolkit.getDefaultToolkit().createImage("material/Seafoods/fish3_L.png");
    public static Image enimies_3_R = Toolkit.getDefaultToolkit().createImage("material/Seafoods/fish3_R.png");
    public static Image salmon_EL = Toolkit.getDefaultToolkit().createImage("material/Seafoods/salmon_EL.png");
    public static Image salmon_ER = Toolkit.getDefaultToolkit().createImage("material/Seafoods/salmon_ER.png");
    public static Image shark_L = Toolkit.getDefaultToolkit().createImage("material/Seafoods/shark_L.png");
    public static Image shark_R = Toolkit.getDefaultToolkit().createImage("material/Seafoods/shark_R.png");
    public static Image myFish_L = Toolkit.getDefaultToolkit().createImage("material/Seafoods/salmon_L.png");
    public static Image myFish_R = Toolkit.getDefaultToolkit().createImage("material/Seafoods/salmon_R.png");
    static int count = 0;
    static int level = 0;


    public static  void drawWord(Graphics graphics,String str,Color color,int size,int x,int y){
        graphics.setColor(color);
        graphics.setFont(new Font("Normal",Font.ITALIC,size));
        graphics.drawString(str, x, y);
    }

}
