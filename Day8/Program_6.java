package Day8;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
 6. Update an Element
Write a program to:
•	Create an ArrayList of subjects.
•	Replace one of the subjects (e.g., “Math” to “Statistics”).
•	Print the list before and after the update.

 */

/*
 8. Iterate using Iterator
Write a program to:
•	Create an ArrayList of cities.
•	Use Iterator to display each fruit.
 */
public class Program_6 {

	public static void main(String[] args) {
			List<String> l=new ArrayList<>();
			l.add(null);
			l.add(0,"Physics");
			l.add(1,"Telugu");
			l.add(2,"Maths");
			l.add(3,"Science");
			l.add("English");
			System.out.println(l);
			l.set(2, "Statistics");
			System.out.println(l);
			System.out.println();
			
			System.out.println("For Iterator:");
			Iterator<String> itr=l.iterator();
			while(itr.hasNext()) {
				System.out.println(itr.next());
			}
	}

}
/*
 output:
 [Physics, Telugu, Maths, Science, null, English]
[Physics, Telugu, Statistics, Science, null, English]

For Iterator:
Physics
Telugu
Statistics
Science
null
English
*/
