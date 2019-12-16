
package BasicQ7;
import BasicQ7.SimpleInput;

//Test program for Basic Q7
public class TestQueue {

    public static void main(String[] args) {
    	
		ListQueue q = new ListQueue();
		byte barray[] = new byte[20];
		int n;
		do {
			n = SimpleInput.getInteger("How many to enqueue?");
			for (int i = 0; i < n; i++) {
				q.enqueue(new Integer(GenLib.genInt(1, 100)));
				System.out.println(q);	
			}
			n = SimpleInput.getInteger("How many to dequeue?");
			for (int i = 0; i < n; i++) {
				if (q.empty()) {
					System.out.println("Queue is empty, dequeue ignored.");
					break;	
				} else {
					System.out.println();
					System.out.println("Dequeued:"+q.dequeue());
					System.out.println(q);
				}	
			}
		} while (SimpleInput.getChar("More to enqueue or dequeue? (y/n)") == 'y');
		System.out.println();
		System.out.println("End");
		System.exit(0);
		
    }

}