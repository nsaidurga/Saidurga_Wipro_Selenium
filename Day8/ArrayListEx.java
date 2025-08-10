/*1.ArrayList
 */
package Day8;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ArrayListEx {

	public static void main(String[] args) {
		
		List<String> l=new ArrayList<>();
		l.add(null);
		l.add(null);
		l.add(0,"Apple");
		l.add(1,"Mango");
		l.add(2,"Kiwi");
		l.add(3,"Banana");
		l.add("Apple");
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
		
		ArrayList<Integer> list=new ArrayList<>(List.of(50,70,80,40,50));
		Collections.sort(list);
		System.out.println(list);
	}
}
/*
output:
[Apple, Mango, Kiwi, Banana, null, null, Apple]
Banana
[Apple, Mango, Orange, Banana, null, null, Apple]
[Apple, Mango, Orange, Kiwi, Banana, null, null, Apple]
true
false
Apple
Apple
3
false
[Mango, Orange, Kiwi, Banana, null, null, Apple]
[Mango, Orange, Banana, null, null, Apple]
reversed[Apple, null, null, Banana, Orange, Mango]
Mango
Orange
Banana
null
null
Apple
Mango
Orange
Banana
null
null
Apple
[40, 50, 50, 70, 80]
*/