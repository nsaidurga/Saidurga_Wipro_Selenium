package Day8;
/*  LinkedHashSet 
1.Create a LinkedHashSet of Integers:
	Add numbers: 10, 5, 20, 15, 5.
	Print the elements and observe the order.
 3.Write a program to:
	Merge two LinkedHashSets and print the result.
 */
import java.util.LinkedHashSet;

public class LHashSet {

	public static void main(String[] args) {
		LinkedHashSet<Integer>  l=new LinkedHashSet<>();
		l.add(10);
		l.add(5);
		l.add(20);
		l.add(15);
		l.add(5);
		System.out.println(l);
		
		LinkedHashSet<Integer>  t=new LinkedHashSet<>();
		t.add(33);
		t.add(53);
		t.add(24);
		t.add(88);
		t.add(44);
		t.addAll(l);
		System.out.println(t);
	}
}
/*output:
[10, 5, 20, 15]
[33, 53, 24, 88, 44, 10, 5, 20, 15]
*/