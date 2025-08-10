package Day8;
/*
 4. Sort Elements
Write a program to:
•	Create an ArrayList of integers.
•	Add at least 7 random numbers.
•	Sort the list in ascending order.
•	Display the sorted list.

 */
import java.util.ArrayList;
import java.util.Collections;

public class Program_4 {

	public static void main(String[] args) {
		ArrayList<Integer> a=new ArrayList<>();
		a.add(30);
		a.add(28);
		a.add(10);
		a.add(18);
		a.add(51);
		a.add(11);
		a.add(23);
		Collections.sort(a);
		System.out.println(a);
	}

}
//output: [10, 11, 18, 23, 28, 30, 51]