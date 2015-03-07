import java.util.Scanner;
public class PayDay {
    
	//Get console input
	private static Scanner scan;
	//Hourly pay
	private static double hPay = 0;
	//Hours worked in a week
	private static double hours = 0;
	//Constant for the bench mark of minimum hours worked
	private static final int MIN= 40;
	//rate for overtime
	private static final double OVER = 1.5;
	//final pay for the week
	private static double check = 0;
	
	public static void main(String[] args) {
		// Intialize Scanner
		scan = new Scanner(System.in);
		
		//Prompts user to input hourly pay
		System.out.println("How much are you payed per hour?");
		hPay = scan.nextDouble();
		
		//Prompts user for hours worked in a week
		System.out.println("How many hours did you work in the week?");
		hours = scan.nextDouble();
		
		
		//performs verification
		//if hours are equal to less than 40 hours
		if(hours == MIN || hours < MIN){check = hPay * hours;}
		else{check = (hPay * hours) + (hours * OVER);}
		
		//Prints to console
		System.out.println("Total pay is " + check);
        
	}

}
