//11. count total digits in a number
package Day2;

import java.util.Scanner;

public class Program_11 {

	public static void main(String[] args) {
		System.out.println("Enter the number:");
		Scanner sc=new Scanner(System.in);
		long n=sc.nextLong();
		int count=0;
		
		while(n>0) {
			long r=n%10;
			count++;
			n/=10;
		}
		
		System.out.println("Total digits in a number: "+count);
	}

}
/*
output:
Enter the number:
2435
Total digits in a number: 4
*/