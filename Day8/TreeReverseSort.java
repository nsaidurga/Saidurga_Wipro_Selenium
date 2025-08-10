package Day8;

import java.util.Comparator;
import java.util.TreeSet;
/*
 3.	Create a TreeSet with a custom comparator:
Sort strings in reverse alphabetical order using Comparator.
 */
public class TreeReverseSort {

	public static void main(String[] args) {
		Comparator<String> reverse=(s1,s2)->s2.compareTo(s1);
		TreeSet<String> set=new TreeSet<>(reverse);
		set.add("Banana");
		set.add("Apple");
		set.add("Mango");
		set.add("Grapes");
		System.out.println("Strings in reverse Alphabetical order:");
		for(String s:set) {
			System.out.println(s);
		}
	}

}
/*
output:
Strings in reverse Alphabetical order:
Mango
Grapes
Banana
Apple
*/