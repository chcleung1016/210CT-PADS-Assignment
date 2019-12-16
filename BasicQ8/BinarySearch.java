
package BasicQ8;

class BinarySearch {
	
	private int globalArray[];
	private static int globalKey;
	private static int globalCount;
	
	//Binary Search constructor
	public int binSearch(int array[], int key) {
		globalArray = array;
		globalKey = key;
		return (binSearchRecur(0, array.length-1));
	}
	
	//Binary Search Recursion constructor
	private int binSearchRecur(int low, int high) {
		int middle;
		if (low > high)
			return -1;
		middle = (low + high) /2;
		globalCount++;
		return globalKey == globalArray[middle] ?
				middle : globalKey < globalArray[middle] ?
						binSearchRecur(low, middle-1) :
							binSearchRecur(middle+1, high);
	}
	
	//Count constructor
	public static int getCount() {
		return globalCount;
	}
	
	//Test constructor of Binary Search
	public static void main (String args[]) {
		BinarySearch object = new BinarySearch();
		int [] array = {11, 12, 34, 55, 66, 77, 88};
		int result = object.binSearch(array, 77);
		System.out.println(result);
		System.out.println("The number of comparison is " + globalCount + ".");
	}
	
}

