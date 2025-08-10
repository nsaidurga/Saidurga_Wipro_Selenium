package Day8;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
/* List(LinkedList)
1. Create and Display a LinkedList
Write a program to:
a)	Create a LinkedList of Strings.
b)	Add five colors to it.
c)	Display the list using a for-each loop.
________________________________________
2. Add Elements at First and Last Position
Write a program to:
a)	Create a LinkedList of integers.
b)	Add elements at the beginning and at the end.
c	Display the updated list.
________________________________________
3. Insert Element at Specific Position
Write a program to:
a)	Create a LinkedList of names.
b)	Insert a name at index 2.
c)	Display the list before and after insertion.
________________________________________
4. Remove Elements
Write a program to:
a)	Create a LinkedList of animal names.
b)	Remove the first and last elements.
c)	Remove a specific element by value.
d)	Display the list after each removal.
________________________________________
5. Search for an Element
Write a program to:
a)	Create a LinkedList of Strings.
b)	Ask the user for a string to search.
c)	Display if the string is found or not.
________________________________________
6. Iterate using ListIterator
Write a program to:
a)	Create a LinkedList of cities.
b)	Use ListIterator to display the list in both forward and reverse directions.
________________________________________
7. Sort a LinkedList
Write a program to:
a)	Create a LinkedList of integers.
b)	Add unsorted numbers.
c)	Sort the list using Collections.sort().
d)	Display the sorted list.
 */
public class LinckedlistEx {

	public static void main(String[] args) {
		
		List<String> l=new LinkedList<String>();
		l.add("Banana");
		//l.add(null);
		l.add(0,"Apple");
		l.add(1,"Mango");
		l.add(2,"Kiwi");
		l.add(3,"Banana");
		System.out.println(l);
		System.out.println(l.get(3));
		
		l.set(2, "Orange");
		System.out.println(l);
		l.add(3,"Kiwi");
		System.out.println(l);
		System.out.println(l.contains("Banana"));
		System.out.println(l.equals("Banana"));
		System.out.println(l.getFirst());
		System.out.println(l.getLast());
		System.out.println(l.indexOf("Kiwi"));
		System.out.println(l.isEmpty());
		l.remove(0);
		System.out.println(l);
		l.remove("Kiwi");
		System.out.println(l);
		System.out.println("reversed"+l.reversed());
		
		Iterator<String> itr=l.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		ListIterator<String> i=l.listIterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		Collections.sort(l);
		System.out.println(l);
	}

}
/* output:
[Apple, Mango, Kiwi, Banana, Banana]
Banana
[Apple, Mango, Orange, Banana, Banana]
[Apple, Mango, Orange, Kiwi, Banana, Banana]
true
false
Apple
Banana
3
false
[Mango, Orange, Kiwi, Banana, Banana]
[Mango, Orange, Banana, Banana]
reversed[Banana, Banana, Orange, Mango]
Mango
Orange
Banana
Banana
Mango
Orange
Banana
Banana
[Banana, Banana, Mango, Orange]
*/