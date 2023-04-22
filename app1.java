
import java.applet.Applet;
import java.awt.Graphics;
import java.util.Date;
import java.util.*;

public class app1 extends Applet{
    public void paint(Graphics g){
        g.drawString("Hello Preksha",50,20);
        Date dt = new Date();
        super.showStatus("Today is " + dt);
    }
}

        

