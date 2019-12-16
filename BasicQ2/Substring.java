
package BasicQ2;
import java.util.*;

public class Substring {

	public static void main(String[] args) {
		
		//Introduction of the program
		System.out.println("This is a program to check substring.");
		
		//Make 2 scanners using Scanner class to let user input 2 strings
		Scanner input1 = new Scanner(System.in);
		Scanner input2 = new Scanner(System.in);

		//Get the user's input (1st string)
		System.out.print("Enter first string: ");
		String string1 = input1.nextLine();
		
		//Input validation of user's 1st input
		if (string1.isEmpty()) {
			System.out.print("Non-alphabetical String!");
			return;
			}
		else if (string1.matches(".*[!@#$%^&*()-+=<>?.'/\"].*")) {
			System.out.print("Non-alphabetical String!");
			return;
			}
		else if (string1.matches(".*\\d+.*")) {
			System.out.print("Non-alphabetical String!");
			return;
		}
		
		//Get the user's input (2nd string)
		System.out.print("Enter second string: ");
		String string2 = input2.nextLine();
		
		//Input validation of user's 2nd input
		if (string2.isEmpty()) {
			System.out.print("Non-alphabetical String!");
			return;
			}
		else if (string2.matches(".*[!@#$%^&*()-+=<>?.'/\"].*")) {
			System.out.print("Non-alphabetical String!");
			return;
			}
		else if (string2.matches(".*\\d+.*")) {
			System.out.print("Non-alphabetical String!");
			return;
		}
		
		//Function to see if second string is a substring of the first string
		if (string1.contains(string2)) {
			System.out.println("'" + string2 + "' is a substring of '" + string1 + "'");
		} else System.out.print("'" + string2 + "' is not a substring of '" + string1 + "'");
		

	}

}
