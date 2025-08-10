/*
 3.	Check If a String Is Empty
Create a lambda (via a functional interface like Predicate<String>) that returns true if a given string is empty.
Predicate<String> isEmpty = s -> s.isEmpty();
 */
package Day5;

import java.util.function.Predicate;

public class CheckStringEmpty {

	public static void main(String[] args) {
		Predicate<String> isEmpty=s->s.isEmpty();
		String str1="";
		String str2="Sai";
		System.out.println("Is empty? "+isEmpty.test(str1));
		System.out.println("Is empty? "+isEmpty.test(str2));
	}

}

/*
output:
Is empty? true
Is empty? false
*/