//13. sum of digits of number(6785=6+7+8+5)
package Day2;
import java.util.Scanner;

public class Program_13 {

	public static void main(String[] args) {
		System.out.println("Enter the number:");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int temp = n;

		int sum = 0;
		while (n > 0) {
			int r = n % 10;
			n /= 10;
			sum += r;
		}
		System.out.println("Sum of digits of number " + temp + " is: " + sum);
	}

}

/*
output:
Enter the number:
6785
Sum of digits of number 6785 is: 26
*/