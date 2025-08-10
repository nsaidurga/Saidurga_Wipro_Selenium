 //6.Dequeue
 
package Day8;
import java.util.ArrayDeque;

public class DequeueEx {
/* Deque
 2.	Double-ended Order System:
o	Add items from front and rear.
o	Remove items from both ends.
o	Display contents of the deque after each operation.
 */
	public static void main(String[] args) {
			ArrayDeque<String> dq=new ArrayDeque<>();
			dq.add("Apple");
			dq.add("Mango");
			dq.add("Watermelon");
			dq.add("Kiwi");
			dq.add("Kiwi");
			//dq.add(null);
			System.out.println(dq);
			
			System.out.println(dq.getFirst());
			System.out.println(dq.getLast());
			dq.offer("Banana");//adds last
			System.out.println(dq);
			
			dq.offerFirst("Melon");
			dq.offerLast("Orange");
			System.out.println(dq);
			System.out.println(dq.peek());
			System.out.println(dq.peekFirst());
			System.out.println(dq.peekLast());
			
			System.out.println(dq.removeFirst());
			System.out.println(dq.removeLast());
			
	}

}
/*
output:
[Apple, Mango, Watermelon, Kiwi, Kiwi]
Apple
Kiwi
[Apple, Mango, Watermelon, Kiwi, Kiwi, Banana]
[Melon, Apple, Mango, Watermelon, Kiwi, Kiwi, Banana, Orange]
Melon
Melon
Orange
Melon
Orange
*/