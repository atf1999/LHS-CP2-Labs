import java.awt.*;
import javax.swing.*;
public class Square{
   public static void main(String[] a) {
      //creates frame
	   JFrame f = new JFrame();
      f.setTitle("Drawing Graphics");
      f.setBounds(100,50,500,300);
      f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      //intializes 
      f.getContentPane().add(new Draw());
      f.setVisible(true);
   }
   static class Draw extends JComponent {
      //Color schema
	  Color[]schema = new Color[]{Color.BLACK, Color.WHITE, 
			  Color.BLACK, Color.WHITE, 
			  Color.BLACK, Color.WHITE, 
			  Color.BLACK, Color.WHITE, 
			  Color.BLACK, Color.WHITE};
      public void paint(Graphics g) {
               //Creates 9 squares. Looping didnt work. IDK why
    	       g.setColor(schema[0]);
               g.fillRect(20, 10, 100, 100);
               
               g.setColor(schema[1]);
               g.fillRect(120, 10, 100, 100);
               
               g.setColor(schema[2]);
               g.fillRect(220, 10, 100, 100);
               
               g.setColor(schema[3]);
               g.fillRect(20, 110, 100, 100);
               
               g.setColor(schema[4]);
               g.fillRect(120, 110, 100, 100);
               
               g.setColor(schema[5]);
               g.fillRect(220, 110, 100, 100);
               
               g.setColor(schema[6]);
               g.fillRect(20, 210, 100, 100);
               
               g.setColor(schema[7]);
               g.fillRect(120, 210, 100, 100);
               
               g.setColor(schema[8]);
               g.fillRect(220, 210, 100, 100);
      }
      }
      
   }
