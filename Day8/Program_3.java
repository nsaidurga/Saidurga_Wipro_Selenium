package Day8;
/*
 3. Remove Specific Element
Write a program to:
•	Create an ArrayList of Strings.
•	Add 5 fruits.
•	Remove a specific fruit by name.
•	Display the updated list.
 */

/*
 10. Copy One ArrayList to Another
Write a program to:
•	Create an ArrayList with some elements.
•	Create a second ArrayList.
•	Copy all elements from the first to the second using addAll() method.

 */
import java.util.ArrayList;
import java.util.List;

public class Program_3 {

	public static void main(String[] args) {
		List<String> l=new ArrayList<>();
		l.add(null);
		l.add(0,"Apple");
		l.add(1,"Mango");
		l.add(2,"Kiwi");
		l.add(3,"Banana");
		l.add("Apple");
		System.out.println(l.remove("Mango"));
		System.out.println(l);
		System.out.println();
		
		List<String> r=new ArrayList<>(l);
		System.out.println(r);
	}

}
/*output:
true
[Apple, Kiwi, Banana, null, Apple]

[Apple, Kiwi, Banana, null, Apple]
*/