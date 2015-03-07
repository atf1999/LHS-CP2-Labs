import java.util.Scanner;
public class Triangle {
	    //Used to get Console Input
		private static Scanner scan;
		//First leg of triangle
		private static int a = 0;
		//Second leg of triangle
		private static int b = 0;
		//Hypotenuse
		private static int c = 0;
	    public static void main(String[] args){
			//Intialize Scanner
	    	scan = new Scanner(System.in);
	    	
	    	//Prompts for first leg
	    	System.out.println("Please input the first leg of the triangle");
	    	a = scan.nextInt();
	    	
	    	//Prompts for second leg
	    	System.out.println("Please input the second leg of the triangle");
	    	b = scan.nextInt();
	    	
	    	//Prompts for the hypotenuse
	    	System.out.println("Please input the hypotenuse of the triangle");
	    	c = scan.nextInt();
	    	
  	    	//Performs identification
	    	if(Math.pow(a, 2) + Math.pow(b, 2) == Math.pow(c, 2)){System.out.println("You my friend have a right triangle");}
	    	else if(Math.pow(a, 2) + Math.pow(b, 2) > Math.pow(c, 2)){System.out.println("You my friend have a acute triangle");}
	    	else{System.out.println("You my friend have a obtuse triangle");}
		}
}
