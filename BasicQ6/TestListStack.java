
package BasicQ6;

import java.util.Stack;
import java.util.Iterator;

//Test program for ListStack
public class TestListStack {

	public static void main(String[] args) {

		ListStack s = new ListStack();

		System.out.println("Initial Stack: ");
		System.out.println(s);
		System.out.println();
		
		s.push(new Character('F'));
		System.out.println(s);
		s.push(new Integer(4));
		System.out.println(s);
		s.push("Fight");
		System.out.println(s);
		s.push("HK");
		System.out.println(s);
		s.push(new Integer(4));
		System.out.println(s);
		s.push("Vote");
		System.out.println(s);
		s.push(new Double(11.24));
		System.out.println(s);
		System.out.println();
		
		System.out.println("The element at the top of the stack is " + s.peek().getData().toString());
		System.out.println();
		
		System.out.println("11.24 is at " + s.search(new Double(11.24)));
		System.out.println("Vote is at " + s.search("Vote"));
		System.out.println("4 is at " + s.search(new Integer(4)));
		System.out.println("HK is at " + s.search("HK"));
		System.out.println();
		
		s.pop();
		System.out.println("The stack after pop peration: ");
		System.out.println(s);
	}

}
