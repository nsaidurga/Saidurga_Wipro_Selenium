//7. check if a number is prime
package Day2;
import java.util.Scanner;

public class Program_7 {

	public static void main(String[] args) {
		System.out.println("Enter the number: ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		if (n == 0 || n == 1) {
			System.out.println(n+" is Not a Prime number");
		} 
		else {
			int flag = 1;
			for (int i = 2; i < n / 2; i++) {
				if (n % i == 0) {
					flag = 0;
					break;
				}
			}
			if (flag == 1) {
				System.out.println(n+" is a Prime number");
			} else {
				System.out.println(n+" is Not a Prime number");
			}
		}
	}

}
/*
output:
Enter the number: 
193
193 is a Prime number
*/