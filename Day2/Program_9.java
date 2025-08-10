//9. print diamond shape using * sign
package Day2;

import java.util.Scanner;

public class Program_9 {

	public static void main(String[] args) {
		System.out.println("Enter the diamond row number:");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n-i;j++) {
				System.out.print(" ");
			}
			for(int k=1;k<=2*i-1;k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(int i=n-1;i>=1;i--) {
			for(int j=1;j<=n-i;j++) {
				System.out.print(" ");
			}
			for(int k=1;k<=2*i-1;k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

}
/*
output:
Enter the diamond row number:
4
   *
  ***
 *****
*******
 *****
  ***
   *
  
*/