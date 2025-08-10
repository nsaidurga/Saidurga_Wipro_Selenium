//7. Write a Java program to display the multiplication table of a number using a loop.
package Day1;

import java.util.Scanner;

public class MultiTable {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
	        System.out.print("Enter a number: ");
	        int num = sc.nextInt();

	        System.out.println("Multiplication Table of " + num);
	        for (int i = 1; i <= 10; i++) {
	            System.out.println(num + " × " + i + " = " + (num * i));
	        }
	        sc.close();
	}

}

/*
output:
Enter a number: 7
Multiplication Table of 7
7 × 1 = 7
7 × 2 = 14
7 × 3 = 21
7 × 4 = 28
7 × 5 = 35
7 × 6 = 42
7 × 7 = 49
7 × 8 = 56
7 × 9 = 63
7 × 10 = 70
*/