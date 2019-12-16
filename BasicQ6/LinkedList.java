
package BasicQ6;

/* ListNode constructor sets instance variable data to refer to
the item passed as an argument and sets the next reference
to null. */
class ListNode {

	private Object data;
	private ListNode next;

	public ListNode(Object o) {
		data = o;
		next = null;
	}

	public ListNode(Object o, ListNode nextNode) {
		data = o;
		next = nextNode;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object o) {
		data = o;
	}

	public ListNode getNext() {
		return next;
	}

	public void setNext(ListNode next) {
		this.next = next;
	}

}

//Empty list exception class
class EmptyListException extends RuntimeException {
	public EmptyListException() {
		super("List is empty");
	}
}

public class LinkedList {

	protected ListNode head;
	protected ListNode tail;

	protected int length;

	public LinkedList() {
		head = tail = null;
		length = 0;
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
		length++;
	}

	//Add to tail constructor
	public void addToTail(Object item) {
		if (isEmpty())
			head = tail = new ListNode(item);
		else {
			tail.setNext(new ListNode(item));
			tail = tail.getNext();
		}
		length++;
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
		length--;
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
		length--;
		return item;
	}

	//Represent the List as String
	public String toString() {
		String str = "[ ";
		ListNode current = head;
		while (current != null) {
			str = str + current.getData() + " ";
			current = current.getNext();
		}
		return str + " ]";
	}

	public int count() {
		return length;
	}

	public Object remove(int n) {
		Object item = null;
		if (n <= length) { //Make sure there is nth node to remove
			//Special treatment for first and last nodes
			if (n == 1)
				return removeFromHead();
			if (n == length)
				return removeFromTail();
			//Removal of nth node which has nodes in front and behind
			ListNode current = head;
			ListNode previous = null;
			for (int i = 1; i < n; i++) { //Current will point to nth node
				previous = current;
				current = current.getNext();
			}
			//Data to be returned
			item = current.getData();
			//Remove the node by adjusting two pointers (object reference)
			previous.setNext(current.getNext());
		}
		length--;
		return item;
	}

	public void add(int n, Object item) {
		//Special treatment for insert as first node
		if (n == 1) {
			addToHead(item);
			return;
		}
		//Special treatment for insert as last node
		if (n > length) {
			addToTail(item);
			return;
		}
		//Locate the n-1th node
		ListNode current = head;
		for (int i = 1; i < n - 1; i++) //Current will point to n-1th node
			current = current.getNext();
		//Create new node and insert at nth position
		current.setNext(new ListNode(item, current.getNext()));
		length++;
	}

	public Object get(int n) {
		//n is too big, no item can be returned
		if (length < n)
			return null;
		//Locate the nth node
		ListNode current = head;
		for (int i = 1; i < n; i++)
			current = current.getNext();
		return current.getData();
	}

}
