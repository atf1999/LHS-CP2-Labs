import java.util.Scanner;
public class Momentum {
    //Used for console input
	private static Scanner scan;
	//used to hold the mass of the object
	private static double mass = 0;
	//used to hold the velocity of the object
	private static double velocity = 0;
	//used to hold the total momentum of an object
	private static double momentum = 0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        scan = new Scanner(System.in);
        
        //obtain mass
        System.out.println("Input the object's mass in kilograms");
        mass = scan.nextDouble();
        
        //obtain velocity
        System.out.println("Input the object's velocity in meters per second");
        velocity = scan.nextDouble();
        
        //perform calculation
        momentum = mass * velocity;
        System.out.println("The total momentum of your object is " + momentum);
	}

}
