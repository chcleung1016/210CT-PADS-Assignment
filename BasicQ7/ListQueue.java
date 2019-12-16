
package BasicQ7;

//ListQueue is a program which contains class methods to enqueue and dequeue in Queue
class EmptyQueueException extends RuntimeException {
	public EmptyQueueException() {
		super("Queue is empty");
	}
}

class ListQueue extends LinkedList {
	private ListNode head;
	private ListNode tail;
	
	//Initialize a queue as empty
	public ListQueue() {
		head = tail = null;
	}
	
	//Return true if the queue is empty, false otherwise
	public boolean empty() {
		return head == null;
	}
	
	//The value of item is inserted at the rear of the queue if it is not full
	public void enqueue(Object item) {
		if (empty())
		 head = tail = new ListNode(item);
		else
			tail = tail.next = new ListNode(item);
	}
	
	//The item at the front of the queue is removed and returned.
	public Object dequeue() throws EmptyQueueException {
		Object item = null;
		if (empty())
			throw new EmptyQueueException();
		item = head.data;
		if (head == tail)
			head = tail = null;
		else
			head = head.next;
		return item;
	}
	
	//Display the Queue in String form
	public String toString() {
		String s = new String("Head[ ");
		ListNode current = head;
		while (current != null) {
			s = s.concat(current.data.toString() + " ");
			current = current.next;
		}
		s = s.concat("]Tail");
		return s;
	}
	
}
	
