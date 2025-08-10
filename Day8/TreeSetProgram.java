package Day8;
/* TreeSet
1. Create a TreeSet of Strings:
a)	Add 5 country names in random order.
b)	Print the sorted list of countries using TreeSet.
 
2.	Create a TreeSet of Integers:
o	Add some numbers and print the first and last elements.
o	Find the elements lower than and higher than a given number using lower() and higher() methods.
*/
import java.util.Collections;
import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetProgram {

	public static void main(String[] args) {
		Comparator<String> sort=(s1,s2)->s1.compareTo(s2);
		TreeSet<String> set=new TreeSet<String>(sort);
		set.add("India");
		set.add("Australia");
		set.add("USA");
		set.add("England");
		set.add("China");
		set.add("Dubai");
		System.out.println(set);
		
		TreeSet<Integer> s=new TreeSet<>();
		s.add(25);
		s.add(17);
		s.add(54);
		s.add(76);
		s.add(19);
		s.add(21);
		System.out.println(s.getFirst());
		System.out.println(s.getLast());
		System.out.println(s.lower(25));
		System.out.println(s.higher(25));
	}

}
/*output: [Australia, China, Dubai, England, India, USA]
[Australia, China, Dubai, England, India, USA]
17
76
21
54
*/