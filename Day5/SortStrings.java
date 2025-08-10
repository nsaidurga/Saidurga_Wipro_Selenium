/*
 6.	 Sort Strings by Length or Alphabetically
 */
package Day5;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortStrings {

	public static void main(String[] args) {
		List<String> w=Arrays.asList("banana","apple","kiwi","mango","pineapple");
		w.sort((s1,s2)->Integer.compare(s1.length(), s2.length()));
		System.out.println("Sorted by length: "+w);
		
		Collections.sort(w);
		System.out.println("Sorted Alphabetically: "+w);
	}

}

/*
output:
	Sorted by length: [kiwi, apple, mango, banana, pineapple]
	Sorted Alphabetically: [apple, banana, kiwi, mango, pineapple]
*/