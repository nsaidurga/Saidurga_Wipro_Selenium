package Day8;

import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
/*Queue
1.	Bank Queue Simulation:
a)	Create a queue of customer names using Queue<String>.
b)	Add 5 customers to the queue.
c)	Serve (remove) customers one by one and print the queue after each removal.
2.	Task Manager:
a)	Queue of tasks (String values).
b)	Add tasks, peek at the next task, and poll completed tasks.
3.	Write a method:
a)	That takes a queue of integers and returns a list of even numbers.
 */
public class QueueEx {

	public static void main(String[] args) {
		PriorityQueue<String> q=new PriorityQueue<>();
		q.add("Apple");
		q.add("Mango");
		q.add("Watermelon");
		q.add("Kiwi");
		q.add("Kiwi");
		//q.add(null);
		//q.add("apple");
		q.add("CusturAppple");
		
		System.out.println(q);
		q.poll();//removes first element
		q.poll();
		System.out.println(q);//Alphabetically
		
		System.out.println(q.element());
		q.offer("Banana");
		System.out.println(q);
		System.out.println(q.peek());
		q.poll();
		System.out.println(" "+q);
		q.remove();
		System.out.println(q);
		q.remove("Kiwi");
		System.out.println(q);
		System.out.println("Even Numbers: ");
		even();
	}
	public static void even() {
		PriorityQueue<Integer> q=new PriorityQueue<>(List.of(18,21,9,24,12,4,11,90));
		for(int i:q) {
			if(i%2==0) {
				System.out.print(i+" ");
			}
		}
	}
}
/*
output:
[Apple, Kiwi, CusturAppple, Mango, Kiwi, Watermelon]
[Kiwi, Kiwi, Watermelon, Mango]
Kiwi
[Banana, Kiwi, Watermelon, Mango, Kiwi]
Banana
 [Kiwi, Kiwi, Watermelon, Mango]
[Kiwi, Mango, Watermelon]
[Mango, Watermelon]
Even Numbers: 
4 12 24 18 90 
*/