package evenodd;
//Program that determines if an integer is even or odd
import java.util.Scanner; //program uses class Scanner
public class EvenOdd { 
	
	public static void main(String[] args) { // main method begins execution of Java application
		
		Scanner input = new Scanner(System.in); //create scanner to obtain input from the command window
		
		System.out.print("Enter integer: "); //prompt
		int number = input.nextInt(); //read first number from user
		
		int remainder = (number % 2); // determine the remainder
		
		if (remainder == 0) //if remainder equals zero, number will be even
	           System.out.println("Number is Even");
	
	        if (remainder != 0) { //if remainder equals something else, number will be odd
	            System.out.println("Number is Odd");
	        }
	} //end method main
} //end class EvenOdd