package Day8;

import java.util.HashSet;
import java.util.Iterator;
/* HashSet
1.	Create a HashSet of Strings:
o	Add 5 different city names.
o	Try adding a duplicate city and observe the output.
o	Iterate using an Iterator and print each city.
2.	Perform operations:
o	Remove an element.
o	Check if a city exists.
o	Clear the entire HashSet.

 */
public class HashEetProgram {

	public static void main(String[] args) {
		HashSet<String> set=new HashSet<String>();
		set.add("Vizag");
		set.add("Hyderabad");
		set.add("Mumbai");
		set.add("Bangalore");
		set.add("Mumbai");
		System.out.println("Vizag");
		System.out.println(set);
		
		Iterator<String> itr=set.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		System.out.println(set.remove("Mumbai"));
		System.out.println(set.contains("Mumbai"));
		set.clear();
		System.out.println(set);

}
}
/*output:
Vizag
[Vizag, Mumbai, Hyderabad, Bangalore]
Vizag
Mumbai
Hyderabad
Bangalore
true
false
[]
*/