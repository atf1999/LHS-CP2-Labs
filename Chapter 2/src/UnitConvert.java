import java.util.Scanner;


public class UnitConvert {
    //Used to get Console input
	private static Scanner scan;
	//holds user input for degrees to convert
	private static double degree = 0;
	//Will hold the converted degrees to radians
	private static double radians = 0;
	public static void main(String[] args){
		//Initialize scanner
		scan = new Scanner(System.in);
		//Prompts user for input
		System.out.println("Hello, please input a number of degrees: ");
		//obtains Scanner input
		degree = scan.nextDouble();
		//Perform conversion
		radians = degree * (Math.PI/180);
		//Tells user their result
		System.out.println(degree + " degrees as radians is " + radians);
	}
	
}
