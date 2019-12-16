
package BasicQ4;

//Test program of LinkedList
public class TestLinkedList {
	
	public static void main (String args[]) {
		
		//Create a new LinkedList
		LinkedList list = new LinkedList();
		
		//Print the null LinkedList first
		System.out.println(list);
		System.out.println();
		
		//Test case of addToHead
		list.addToHead (new Character('A'));
		System.out.println(list);
		list.addToHead (new String("Boy"));
		System.out.println(list);
		list.addToHead (new Character('C'));
		System.out.println(list);
		list.addToHead (new Integer(88));
		System.out.println(list);
		
		//Test case of removeFromTail
		while (!list.isEmpty()) {
			System.out.println("Removed: " + list.removeFromTail());
			System.out.println(list);
		}
		
		System.out.println();
		
		//Test case of addToTail
		list.addToTail (new Integer(1));
		System.out.println(list);
		list.addToTail (new String("Independent Commission of Inquiry"));
		System.out.println(list);
		list.addToTail (new Integer(2));
		System.out.println(list);
		list.addToTail (new String("Withdraw criminal charges"));
		System.out.println(list);
		
		//Test case of removeFromHead
		while (!list.isEmpty()) {
			System.out.println("Removed: " + list.removeFromHead());
			System.out.println(list);
		}

	}
	
}
