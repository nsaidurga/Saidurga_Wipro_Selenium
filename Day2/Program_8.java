//8. print pyramid pattern
package Day2;
import java.util.Scanner;

public class Program_8 {

	public static void main(String[] args) {
		System.out.println("Enter the Pyramid row number:");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<n-i;j++) {
				System.out.print(" ");
			}
			for(int k=0;k<=i;k++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
/*
output:
Enter the Pyramid row number:
4
    * 
   * * 
  * * * 
 * * * * 

*/