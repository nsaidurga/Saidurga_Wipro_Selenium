//4. Write a Java program demonstrating the use of arithmetic, relational, and logical operators.
package Day1;

public class OperatorsProgram {

	public static void main(String[] args) {
		 int a = 10, b = 5;

	        // Arithmetic Operators
	        System.out.println("Addition: " + (a + b));
	        System.out.println("Multiplication: " + (a * b));

	        // Relational Operators
	        System.out.println("a > b: " + (a > b));
	        System.out.println("a == b: " + (a == b));

	        // Logical Operators
	        boolean x = true, y = false;
	        System.out.println("x && y: " + (x && y));
	        System.out.println("x || y: " + (x || y));
	        
	}

}
/* output:
Addition: 15
Multiplication: 50
a > b: true
a == b: false
x && y: false
x || y: true
*/
