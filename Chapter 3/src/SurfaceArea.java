import java.util.Scanner;
public class SurfaceArea {
    //Used for console input
	private static Scanner scan;
	//Value that the length of a side of a cube is
	private static int length = 0;
	//Holds the final surface area of the cube
	private static double surfaceArea = 0;
	public static void main(String[] args) {
		//Intialize Scanner
		scan = new Scanner(System.in);
		//Gets the length of the cube
		System.out.println("Input the length of the side of the cube");
		length = scan.nextInt();
		
		//Performs cube calculation
		surfaceArea = 6 * (Math.pow(length, 2));
		
		//Prints to console
		System.out.println("A cube with a side length of " + length + " is " + surfaceArea);
	}

}
