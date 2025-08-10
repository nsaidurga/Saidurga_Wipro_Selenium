//2. Write a Java program to demonstrate the use of if-else and switch-case statements.
package Day1;

import java.util.Scanner;

public class IfSwitch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter your age: ");
		int age = sc.nextInt();

		if (age >= 18) {
			System.out.println("You are eligible to vote.");
		} else {
			System.out.println("You are NOT eligible to vote.");
		}

		
		System.out.print("Enter day number (1 to 7): ");
		int day = sc.nextInt();

		switch (day) {
		case 1:
			System.out.println("Sunday");
			break;
		case 2:
			System.out.println("Monday");
			break;
		case 3:
			System.out.println("Tuesday");
			break;
		case 4:
			System.out.println("Wednesday");
			break;
		case 5:
			System.out.println("Thursday");
			break;
		case 6:
			System.out.println("Friday");
			break;
		case 7:
			System.out.println("Saturday");
			break;
		default:
			System.out.println("Invalid day number!");
		}

		sc.close();
	}

}

/*
output:
Enter your age: 23
You are eligible to vote.
Enter day number (1 to 7): 3
Tuesday
*/