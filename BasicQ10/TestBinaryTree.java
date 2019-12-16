
package BasicQ10;
import java.util.*;

//Test program for BasicQ10
public class TestBinaryTree {
	
	public static void main(String[] args) {
		
		int data = 0;
		BinarySearchTree tree = new BinarySearchTree();
		
		//Make a scanner using Scanner class to let user input a number
		Scanner input = new Scanner(System.in);
		
		for (int k = 1; k <= 10; k++) {
			//Get the user's input
			System.out.print("Enter a number: ");
			int inputnum = input.nextInt();
			System.out.print(inputnum + " ");
			tree.insert(inputnum);
			System.out.println();
		}
		System.out.println();
		
		tree.inorder();
		tree.delete(data);
		tree.inorder();

	}

}
