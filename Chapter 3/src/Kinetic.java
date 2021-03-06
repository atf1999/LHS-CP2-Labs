import java.util.Scanner;
public class Kinetic {
    //Used to get console input
	private static Scanner scan;
	//holds mass
	private static double mass = 0;
	//holds velocity
	private static double velocity = 0;
	//holds momentum
	private static double momentum = 0;
	//holds kinetic energy
	private static double kinetic = 0;
	public static void main(String[] args) {
		//Intialize Scanner
		scan = new Scanner(System.in);
		
		//Get mass
		System.out.println("Please input the mass of the object in Kilometers");
		mass = scan.nextDouble();
		
		//Gets velocity
		System.out.println("Please input the velocity of the object in meters per second");
		velocity = scan.nextDouble();
		
		//Performs momentum and KE calculations
		momentum = mass * velocity;
		kinetic = mass * Math.pow(velocity, 2)/2;
		
		
		//Prints to console
		System.out.println("Total momentum is " + momentum);
		System.out.println("Total kinetic energy is " + kinetic);
	}

}
