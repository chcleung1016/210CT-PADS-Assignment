
package BasicQ12;
import java.io.*;
import java.util.*;

public class QuickSort {
	
	//Number of items
	int n;
	//Array to store values
	int a[];
	
	//Make a scanner using Scanner class to let user input a number
	Scanner input = new Scanner(System.in);
	
	//A function for user to input the number of items and values in array
	QuickSort() {
		System.out.print("Enter number of items: ");
		n = input.nextInt();
		a = new int[n];
		for (int i = 0; i < n; i++) {
			System.out.print("Enter the value in array [" + (i + 1) + "]: ");
			a[i] = input.nextInt();
		}
	}
	
	//Display the values in array
	void display() {
		for (int i = 0; i < n; i++)
			System.out.print(a[i] + " ");
		System.out.println();
	}

	void quick(int left, int right) {
		if (right - left <= 0)
			return;
		else {
			int piv = a[right];
			int pos = partition(left, right, piv);
			quick(left, pos - 1);
			quick(pos + 1, right);
		}
	}
	
	//Partition the elements
	int partition(int left, int right, int piv) {
		int l = left - 1;
		int r = right;
		while (true) {
			while (a[++l] < piv);
			while (r > 0 && a[--r] > piv);
			if (l >= r)
				break;
			else
				swap(l, r);
		}
		swap(l, right);
		return l;
	}
	
	//Swap the elements
	void swap(int l, int r) {
		int temp;
		temp = a[l];
		a[l] = a[r];
		a[r] = temp;
	}
	
	//Main program of quick sort
	public static void main(String args[]) {
		QuickSort object = new QuickSort();
		System.out.println();

		System.out.println("Values before sorting: ");
		object.display();
		System.out.println();

		object.quick(0, object.n - 1);
		System.out.println("Values after sorting: ");
		object.display();
	}

}
