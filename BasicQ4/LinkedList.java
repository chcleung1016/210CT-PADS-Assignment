
package BasicQ4;

/* ListNode constructor sets instance variable data to refer to
the item passed as an argument and sets the next reference
to null. */
class ListNode {

	Object data;
	ListNode next;

	ListNode(Object o) {
		data = o;
		next = null;
	}

	ListNode(Object o, ListNode nextNode) {
		data = o;
		next = nextNode;
	}

	Object getData() {
		return data;
	}

	ListNode getNext() {
		return next;
	}

}

//Empty list exception
class EmptyListException extends RuntimeException {
	public EmptyListException() {
		super("List is empty");
	}
}

class LinkedList {
	private ListNode head;
	private ListNode tail;

	public LinkedList() {
		head = tail = null;
	}

	// Determine if the list is empty
	public boolean isEmpty() {
		return head == null;
	}

	// Add to head function
	public void addToHead(Object item) {
		if (isEmpty())
			head = tail = new ListNode(item);
		else
			head = new ListNode(item, head);
	}

	//Add to tail function
	public void addToTail(Object item) {
		if (isEmpty())
			head = tail = new ListNode(item);
		else
			tail = tail.next = new ListNode(item);
	}

	//Remove from head function
	public Object removeFromHead() throws EmptyListException {
		Object item = null;
		if (isEmpty())
			throw new EmptyListException();
		item = head.getData();
		if (head == tail)
			head = tail = null;
		else
			head = head.getNext();
		return item;
	}

	//Remove from tail function
	public Object removeFromTail() throws EmptyListException {
		Object item = null;
		if (isEmpty())
			throw new EmptyListException();
		item = tail.getData();
		if (head == tail)
			head = tail = null;
		else {
			ListNode current = head;
			while (current.getNext() != tail)
				current = current.next;
			tail = current;
			tail.next = null;
		}
		return item;
	}

	//Represent the List as String
	public String toString() {
		String s = "[ ";
		ListNode current = head;
		while (current != null) {
			s += current.getData() + " ";
			current = current.getNext();
		}
		return s + "]";
	}

}
