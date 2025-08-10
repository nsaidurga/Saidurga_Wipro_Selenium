/*
 2.Create addition of two numbers using variables 
 */
package Day3;
import java.util.Scanner;

public class Addition {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first number:");
		int a=sc.nextInt();
		System.out.println("Enter second number:");
		int b=sc.nextInt();
		
		System.out.println("Addition of two numbers: ");
		System.out.println(a+b);
		sc.close();
		}

}

/*
 output:
 Enter first number:
245
Enter second number:
125
Addition of two numbers: 
370
*/