
package BasicQ1;
import java.util.*;

public class ArmstrongNumber {
	
	public static void main(String[] args) {
		
		//Initialize 3 integers for Armstrong number validation
		int total = 0, num, temp; 
		
		//Introduction of the program
		System.out.println("This is a program to check a 3-digit number whether it is or not an Armstrong number.");
		
		//Make a scanner using Scanner class to let user input a number
		Scanner input = new Scanner(System.in);

		try{
			
			//Get the user's input
			System.out.print("Enter a number: ");
			int inputnum = input.nextInt();
			
			//Check the user's input whether it is a 3-digit number
			if (inputnum < 1) {
				System.out.println("Out of range!");
				return;
			} else if (inputnum >= 1000) {
				System.out.println("Out of range!");
				return;
			}
			
			//Armstrong number validation
			num = inputnum;
			while (num != 0 ) {
				temp = num % 10;
				total = total + temp * temp * temp;
				num /= 10;
			}
			
			//Show the result to user
	        if(total == inputnum)
	            System.out.println("Yes, " + inputnum + " is an Armstrong number!");
	        else
	            System.out.println("No, " + inputnum + " is not an Armstrong number!");
		
		}
		catch(InputMismatchException exception) {
			
		  //If the user does not input number, the console will print the message "This is not a number!"
		  System.out.println("This is not a number!");
		  
		}
		
	}

}
