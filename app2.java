import java.applet.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import javax.lang.model.util.ElementScanner6;
public class app2 extends Applet 
{  Choice color=new Choice();
  
  public void init()
  {
    
    color.addItem("Red");
    color.addItem("Green");
    color.addItem("Blue");
    color.addItem("Yellow");
    color.addItem("Purple");
    color.addItem("Orange");

    add(color);
    
  
        
  }
  public void paint(Graphics g)
    { 
      String colour=color.getSelectedItem();
      int R=0,G=0,B=0;
      if(colour=="Red")
        R=100;
      else if(colour=="Green")
        G=100;
      else if(colour=="Blue")
       B=100;
       else if(colour=="Yellow"){
        R=100;G= 100;B= 0;
       }
       else if(colour=="Purple"){
        R=100;G= 0;B= 100;
       }
       else if(colour=="Orange"){
        R=100;G= 65;
       }
       
      Color colorCode=new Color(R,G,B);
      this.setBackground(colorCode);

    }
}
