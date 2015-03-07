import java.util.Scanner;
public class Calls {
    
	//Used to get Console input
	private static Scanner scan;
	//holds the length of a call
	private static int minutes = 0;
	//holds final billing
	private static double bill = 0;
	public static void main(String[] args) {
		// Intialize Scanner
		scan = new Scanner(System.in);
		
		//Prompts for length of call
		System.out.println("Please input the lenght of your phone call to Lexington, Va");
		minutes = scan.nextInt();
		
		//performs calculations
		if(minutes == 2 || minutes < 2){bill = 1.15;}
		else{bill = 1.15 + ((minutes - 2)* .5);}
		
		//Prints to console
		System.out.println("Final pay is " + bill);
	}

}
