//10. Write a program that uses a switch-case to simulate a basic calculator.
package Day1;

public class Calculator {

	public static void main(String[] args) {
		int a = 23;
		int b = 54;
		char ch = '+';

		switch (ch) {
		case '+':
			System.out.println(a + b);
			break;
		case '-':
			System.out.println(a - b);
			break;
		case '*':
			System.out.println(a * b);
			break;
		case '/':
			System.out.println(a / b);
			break;
		case '%':
			System.out.println(a % b);
			break;
		default:
			System.out.println("Invalid Opertaor");
		}
	}
}

/*
output:
77
*/