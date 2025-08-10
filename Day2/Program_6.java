//6. print factorial of a number(eg. 5!=5*4*3*2*1)
package Day2;

import java.util.Scanner;

public class Program_6 {

	public static long factorial(int k) {
		long result = 1;
		for (int i = 1; i <= k; i++) {
			result *= i;
		}
		return result;
	}

	public static void main(String[] args) {
		System.out.println("Enter the number: ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long fact = factorial(n);
		System.out.println("Factorial of " + n + " is : " + fact);
	}
}

/*
output:
Enter the number: 
5
Factorial of 5 is : 120
*/