//12. check palindrome number
package Day2;

import java.util.Scanner;

public class Program_12 {

	public static void main(String[] args) {
		System.out.println("Enter the number:");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		int temp=n;
		int reverse=0;
		
		while(n>0) {
			int r=n%10;
			n/=10;
			reverse=reverse*10+r;
		}
		
		if(reverse==temp) {
			System.out.println("The given number is Palindrome");
		}
		else {
			System.out.println("The given number is not Palindrome");
		}
	}

}
/*
output:
Enter the number:
12321
The given number is Palindrome
*/