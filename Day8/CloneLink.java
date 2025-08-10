/*
 10. Clone a LinkedList
Write a program to:
•	Create a LinkedList of numbers.
•	Clone it using the clone() method.
•	Display both original and cloned lists.

 */
package Day8;
import java.util.LinkedList;

public class CloneLink {

	public static void main(String[] args) {
		LinkedList<Character> a=new LinkedList<>();
		a.add('A');
		a.add('G');
		a.add('B');
		for(char c:a) {
			System.out.println(c);
		}
		
		LinkedList<Integer> ln=new LinkedList<>();
		ln.add(10);
		ln.add(30);
		ln.add(20);
		ln.add(60);
		
		System.out.println("Original list: "+ln);
		System.out.println("Cloned list: "+ln.clone());
		
		Object ln1=new LinkedList<>();
		ln1=ln.clone();
		System.out.println();
		System.out.println("Original list: "+ln);
		System.out.println("Cloned list: "+ln1);
	}

}
/*
output:
A
G
B
Original list: [10, 30, 20, 60]
Cloned list: [10, 30, 20, 60]

Original list: [10, 30, 20, 60]
Cloned list: [10, 30, 20, 60]
*/