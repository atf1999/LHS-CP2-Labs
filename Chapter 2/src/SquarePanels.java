import javax.swing.*;
import java.awt.*;
public class SquarePanels {
        //Intialize panels, hold being the base panel and the others being squared  
	    private static JPanel hold = new JPanel(), one = new JPanel(),
        		  		        two = new JPanel(), three = new JPanel(),
        		  		        four = new JPanel(), five = new JPanel(),
        		  		        six = new JPanel(), seven = new JPanel(),
        		  		        eight = new JPanel(), nine = new JPanel();
	      //puts the panels into an array such that looping can be used
          private static JPanel[] panels = new JPanel[]{one, two, three, four, five, six, seven, eight, nine};
          //similiar idea as the JPanel(looping)
          private static Color[] colors = new Color[]{Color.BLACK, Color.WHITE, Color.BLACK, Color.WHITE, Color.BLACK, Color.WHITE, Color.BLACK, Color.WHITE, Color.BLACK};
          //frame
          private static JFrame frame = new JFrame("Squares Galore");
	      public static void main(String[] args){
        	  frame.setSize(600, 600);
        	  frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        	  //three rows, three columns
        	  hold.setLayout(new GridLayout(3, 3));
        	  for(int i = 0; i < panels.length; ++i){
        	       //due to layout manager, preferred size must be used
        		   panels[i].setPreferredSize(new Dimension(frame.getWidth()/3, frame.getHeight()/3));
        	       //sets color based on loop
        		   panels[i].setBackground(colors[i]);
        	       //adds panel to manifest panel
        		   hold.add(panels[i]);
        	  }
        	  //adds manifest to the frame
        	  frame.add(hold);
        	  frame.setVisible(true);
          }
}
