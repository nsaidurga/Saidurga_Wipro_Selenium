package Day8;
/*
 7. Remove All Elements
Write a program to:
•	Create an ArrayList of integers.
•	Add multiple elements.
•	Remove all elements using clear() method.
•	Display the size of the list.
 */
import java.util.ArrayList;
import java.util.List;

public class Program_7 {

	public static void main(String[] args) {
		List<String> l=new ArrayList<>();
		l.add(null);
		l.add(0,"Physics");
		l.add(1,"Telugu");
		l.add(2,"Maths");
		l.add(3,"Science");
		l.add("English");
		System.out.println(l);
		l.clear();
		System.out.println(l.size());
	}

}
//output:
/*
[Physics, Telugu, Maths, Science, null, English]
0
*/