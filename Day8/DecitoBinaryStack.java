package Day8;

import java.util.Scanner;
import java.util.Stack;
/*Stack
•	Convert a decimal number to binary using Stack.
 */
public class DecitoBinaryStack {
	public static void binary(int n) {
		Stack<Integer> s=new Stack<>();
		if(n==0) {
			System.out.println("Binary of 0 is 0");
		}
		while(n>0) {
			s.push(n%2);
			n/=2;
		}
		System.out.println(s);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a decimal number:");
		int n=sc.nextInt();
		binary(n);
		sc.close();
	}
}
/* output:
Enter a decimal number:
354637
[1, 0, 1, 1, 0, 0, 1, 0, 1, 0, 0, 1, 0, 1, 1, 0, 1, 0, 1]
*/