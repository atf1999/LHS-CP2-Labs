import javax.swing.*;

import java.awt.*;
import javax.swing.*;
public class CheckerBoard {
    //Creates the board colors
	private static Color[] schema = new Color[]{Color.BLACK, Color.RED,
    	                                        Color.BLACK, Color.RED,
    	                                        Color.BLACK, Color.RED,
    	                                        Color.BLACK, Color.RED,
    	                                        Color.BLACK, Color.RED,
    	                                        Color.BLACK, Color.RED,
    	                                        Color.BLACK, Color.RED,
    	                                        Color.BLACK, Color.RED,
    	                                        Color.BLACK, Color.RED,
    	                                        Color.BLACK, Color.RED,};
    //used for the y coord
    public static int yCoord = 0;
    public static void main(String[] a) {
	  //frame setup
	  JFrame f = new JFrame();
      f.setTitle("Drawing Graphics in a Frame"
         +" by Adding a Component");
      f.setSize(500, 500);
      f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      //the pane is wierd so i made it big for security
      f.getContentPane().setSize(6000, 6000);
      f.getContentPane().setPreferredSize(new Dimension(6000, 6000));
      f.getContentPane().add(new MyComponent());
      f.setVisible(true);
   }
   static class MyComponent extends JComponent {
	   
       public void draw(Graphics g){
    	   for(int j = 0; j < 8; ++j){
     	    	//paint a row of squares 8 times
    		    g.setColor(schema[j]);
     	    	g.fillRect(0, yCoord, 50, 50);
     	    	g.setColor(schema[j+1]);
     	    	g.fillRect(50, yCoord, 50, 50);
     	    	g.setColor(schema[j+2]);
     	    	g.fillRect(100, yCoord, 50,50);
     	    	g.setColor(schema[j+3]);
     	    	g.fillRect(150, yCoord, 50, 50);
          	    g.setColor(schema[j+4]);
          	    g.fillRect(200, yCoord, 50,50);
          	    g.setColor(schema[j+5]);
          	    g.fillRect(250, yCoord, 50, 50);
          	    g.setColor(schema[j+6]);
          	    g.fillRect(300, yCoord, 50,50);
          	    g.setColor(schema[j+7]);
          	    g.fillRect(350, yCoord, 50, 50);
          	    yCoord += 50;
    		   
       	    
    	   }
       }
	   public void paint(Graphics g) {
		  //calls method
		   draw(g);
           	    
           	    }
      	    
      	    }
      }
      
   

