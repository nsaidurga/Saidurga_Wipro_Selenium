/*
 9.	Explain the difference between passing primitive and non-primitive types 
 to methods in Java with examples.
 */
package Day7;
import java.util.Arrays;
public class CallByRef9 {

	public static void main(String[] args) {
		int num = 10;
		changePrimitive(num);
		System.out.println("After method call (primitive): " + num);

		int[] arr = { 1, 2, 3 };
		changeNonPrimitive(arr);
		System.out.println("After method call (non-primitive): " + Arrays.toString(arr));
	}

	static void changePrimitive(int value) {
		value = 50; 
	}

	static void changeNonPrimitive(int[] array) {
		array[0] = 99; 
	}
}
/*
output:
After method call (primitive): 10
After method call (non-primitive): [99, 2, 3]
*/