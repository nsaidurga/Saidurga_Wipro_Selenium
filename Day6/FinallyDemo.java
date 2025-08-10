/*
 3.	Add a finally block after each try catch that prints "Operation completed.".
Example structure:
try {
    // division or array access
} catch (ArithmeticException e) {
    System.out.println("Division by zero is not allowed!");
} finally {
    System.out.println("Operation completed.");
}
 */
package Day6;

public class FinallyDemo {
	public static void main(String[] args) {

		try {
			int a = 10;
			int b = 0;
			int result = a / b;
			System.out.println("Result: " + result);
		} catch (ArithmeticException e) {
			System.out.println("Division by zero is not possible");
		} finally {
			System.out.println("Operation completed.");
		}

		try {
			int[] arr = { 1, 2, 3 };
			System.out.println(arr[5]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Array index out of bounds");
		} finally {
			System.out.println("Operation completed.");
		}
	}
}
/*
output:
Division by zero is not possible
Operation completed.
Array index out of bounds
Operation completed.
*/