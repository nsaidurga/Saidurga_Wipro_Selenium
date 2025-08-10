/*
 1: Division & Array Access
Write a Java class ExceptionDemo with a main method that:
1.	Attempts to divide an integer by zero and access an array out of bounds.
2.	Wrap each risky operation in its own try catch:
a)	Catch only the specific exception types: ArithmeticException and ArrayIndexOutOfBoundsException.
b)	In each catch, print a user-friendly message.
 */
package Day6;
public class ExceptionDemo {

	public static void main(String[] args) {
		System.out.println(1);
		System.out.println(2);
		try {
			int[] a=new int[4];
			System.out.println(a[6]);
			System.out.println(5/0);
			String str="Hello";
			System.out.println(str.charAt(6));
		}
		catch(StringIndexOutOfBoundsException e) {
			System.out.println(e);
		}
		catch(ArithmeticException e) {
			System.out.println(e);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}
		finally {
			System.out.println("Important code");
		}
		System.out.println(4);
		System.out.println(5);
	}

}

/*
output:
1
2
java.lang.ArrayIndexOutOfBoundsException: Index 6 out of bounds for length 4
Important code
4
5
*/