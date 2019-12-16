
package BasicQ7;

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

	void setData(Object data) {
		this.data = data;
	}

	void setNext(ListNode next) {
		this.next = next;
	}
	
}

//Empty list exception class
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
	
	//Determine if the list is empty
	public boolean isEmpty() {
		return head == null;
	}
	
	//Add to head constructor
	public void addToHead(Object item) {
		if (isEmpty())
			head = tail = new ListNode(item);
		else
			head = new ListNode(item, head);
	}
	
	//Add to tail constructor
	public void addToTail(Object item) {
		if (isEmpty())
			head = tail = new ListNode(item);
		else {
			tail.setNext(new ListNode(item));
			tail = tail.getNext();
		}
	}
	
	//Remove from head constructor
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
	
	//Remove from tail constructor
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
				current = current.getNext();
			tail = current;
			current.setNext(null);
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