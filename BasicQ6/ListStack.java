
package BasicQ6;
import java.util.EmptyStackException;

public class ListStack extends LinkedList {

	public ListStack() {
		super();
	}
	//Tests if this stack is empty
	public boolean empty() {
		return (length == 0);
	}
	//Push constructor pushes an item onto the top of the stack
	public Object push(Object item) {
		head = new ListNode(item, head);
		return length++;
	}
	
	/*Removes the object at the top of this stack and returns
	 that object as the value of this function*/
	public ListNode pop() {
		if (isEmpty()) {
			throw new EmptyStackException();
		}
		head = head.getNext();
		return head;
	}

	//Looks at the object at the top of this stack without removing it from the stack
	public ListNode peek() {
		if (isEmpty()) {
			throw new EmptyStackException();
		}
		return head;
	}

	public int search(Object item) {
		return length--;
	}

}
