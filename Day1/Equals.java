//7. Explain the difference between == and .equals() in Java.
//== is used to compare references where .equals() compares content
package Day1;

public class Equals {

	public static void main(String[] args) {
		String a = new String("Hello");
		String b = new String("Hello");

		System.out.println(a == b);  
		System.out.println(a.equals(b)); 
	}

}

/*
output:
false
true
*/