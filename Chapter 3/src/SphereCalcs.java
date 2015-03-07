import java.util.Scanner;
public class SphereCalcs {
    //Used to hold the console inputs
	private static Scanner scan;
	//holds the radius of the circle
	private static double radius = 0;
	//used to hold the circumference
	private static double circumference = 0;
	//holds diameter
	private static double diameter = 0;
	//holds volume
	private static double volume = 0;
	//holds surface area
	private static double surfaceArea = 0;
	
	public static void main(String[] args) {
		// Intialize scanner
		scan = new Scanner(System.in);
		
		//Prompts user to insert radius
		System.out.println("Please input the radius of the circle");
		radius = scan.nextDouble();
		
		//perform circumference calculation
		circumference = 2 * Math.PI * radius;
		
		//perform diamter calculation
		diameter = 2 * radius;
		
		//performs volume calculation
		volume = (4 * Math.PI * (Math.pow(radius, 3))/3);
		
		//performs surface area calculation
		surfaceArea = 4 * Math.PI * (Math.pow(radius, 2));
		
		//Print out the data
		System.out.println("The circumference is " + circumference);
		System.out.println("The diamter is " + diameter);
		System.out.println("The volume is " + volume);
		System.out.println("The surface area is " + surfaceArea);
	}

}
