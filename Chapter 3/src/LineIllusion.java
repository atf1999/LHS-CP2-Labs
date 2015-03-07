import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JComponent;
import javax.swing.JFrame;




public class LineIllusion extends JComponent {

	public static void main(String[] a) {
	      //creates frame
		   JFrame f = new JFrame();
	      f.setTitle("Drawing Graphics");
	      f.setBounds(100,50,500,500);
	      f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	      //intializes
	      f.getContentPane().add(new Draw());
	      f.setVisible(true);
	   }
		   
	   
	   static class Draw extends JComponent {
	     //Paint Illusion
	      public void paint(Graphics g) {
	          g.setColor(Color.BLACK);
	          //paints the the arrows opened
	          g.drawLine(200, 100, 300, 100);
	          g.drawLine(170, 50, 200, 100);
	          g.drawLine(200, 100, 170, 150);
	          g.drawLine(330, 50, 300, 100);
	          g.drawLine(300, 100, 330, 150);
	          
	          //paints arrow
	          g.drawLine(200, 200, 300, 200);
	          g.drawLine(200, 200, 220, 150);
	          g.drawLine(200, 200, 220, 250);
	          g.drawLine(300, 200, 280, 150);
	          g.drawLine(300, 200, 280, 250);
	      }
	      }
}

