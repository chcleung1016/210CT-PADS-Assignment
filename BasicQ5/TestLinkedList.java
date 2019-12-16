
package BasicQ5;

//Test program of LinkedList
public class TestLinkedList {
	
	public static void main (String args[]) {
		
		//Create a new LinkedList
		LinkedList list = new LinkedList();
		
		//Print the null LinkedList first
		System.out.println(list);
		System.out.println();
		
		//Test case of addToHead
		list.addToHead (new Character('X'));
		System.out.println(list);
		list.addToHead (new Integer(2020));
		System.out.println(list);
		list.addToHead (new String("Now"));
		System.out.println(list);
		list.addToHead (new Integer(2019));
		System.out.println(list);
		
		//Test case of removeFromTail
		while (!list.isEmpty()) {
			System.out.println("Removed:" + list.removeFromTail());
			System.out.println(list);
		}
		
		System.out.println();
		
		//Test case of addToTail
		list.addToTail (new Integer(2046));
		System.out.println(list);
		list.addToTail (new String("Being End"));
		System.out.println(list);
		list.addToTail (new Integer(2047));
		System.out.println(list);
		list.addToTail (new Character('X'));
		System.out.println(list);
		
		//Test case of removeFromHead
		while (!list.isEmpty()) {
			System.out.println("Removed:" + list.removeFromHead());
			System.out.println(list);
		}

	}
	
}
