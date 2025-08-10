package Day8;

import java.util.PriorityQueue;
/* PriotyQueue
3.	Write a method:
a)	To merge two PriorityQueue<Integer> and return a sorted merged queue.
 */
public class MergeTwoObjects {
	public static PriorityQueue<Integer> merged(PriorityQueue<Integer> q1,PriorityQueue<Integer> q2) {
		PriorityQueue<Integer> merge=new PriorityQueue<>();
		merge.addAll(q1);
		merge.addAll(q2);
		return merge;
	}
	
	public static void main(String[] args) {
		PriorityQueue<Integer> q1=new PriorityQueue<>();
		PriorityQueue<Integer> q2=new PriorityQueue<>();
		 	q1.add(5);
	        q1.add(1);
	        q1.add(9);

	        q2.add(4);
	        q2.add(7);
	        q2.add(2);
	        
	        PriorityQueue<Integer> res=merged(q1,q2);
	        
	        System.out.println("Merged Sorted Queue:");
	        while(!res.isEmpty()) {
	        	System.out.print(res.poll()+" ");
	        }
	}
}
/*
output:
Merged Sorted Queue:
1 2 4 5 7 9 
*/