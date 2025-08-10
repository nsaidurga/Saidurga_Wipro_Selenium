//5. Convert Strings to Uppercase/Lowercase
package Day5;

import java.util.function.Function;

public class UpperLower {

	public static void main(String[] args) {
		Function<String,String> toUpper=s->s.toUpperCase();
		Function<String,String> toLower=s->s.toLowerCase();
		String i="JavaLamda";
		System.out.println("Uppercase: "+toUpper.apply(i));
		System.out.println("Lowercase: "+toLower.apply(i));
	}

}

/*
 output:
 Uppercase: JAVALAMDA
Lowercase: javalamda
*/