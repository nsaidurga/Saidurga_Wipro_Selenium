package Day8;

import java.util.ArrayList;
import java.util.Collections;

/*
 5. Reverse the ArrayList
Write a program to:
•	Create an ArrayList of characters.
•	Add 5 characters.
•	Reverse the list using Collections.reverse() and display it.

 */
public class Program_5 {

	public static void main(String[] args) {
		ArrayList<Character> a=new ArrayList<>();
		a.add('e');
		a.add('a');
		a.add('c');
		a.add('b');
		a.add('f');
		Collections.sort(a);
		System.out.println(a);
	}

}
//output: [a, b, c, e, f]