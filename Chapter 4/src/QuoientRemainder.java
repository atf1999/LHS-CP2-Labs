import java.util.Arrays;
import java.util.Scanner;
public class QuoientRemainder {
    
	//Used to get console input
	private static Scanner scan;
	//gets first input
	private static int first = 0;
	//gets second input
	private static int second = 0;
	//holds quotient
	private static int quotient = 0;
	//holds remainder
	private static int remainder = 0;
	public static void main(String[] args) {
        //Intialize scanner
		scan = new Scanner(System.in);
		
		//Prompts for first input
		System.out.println("Please input your first number");
		first = scan.nextInt();
		
		//Prompts for second input
		System.out.println("Please input your second number");
		second = scan.nextInt();
		
		//performs calculation
		if(first > second || first == second){quotient = first/second; remainder = first % second;}
		else if(second > first){quotient = second/first; remainder = second % first;}
		
		//prints the results
	    System.out.println("Quotient: " + quotient + " and Remainder: " + remainder);
	}

}
