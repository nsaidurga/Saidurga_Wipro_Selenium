/*
 1.	Write a program to:
a)	Read an int value from user input.
b)	Assign it to a double (implicit widening) and print both.
c)	Read a double, explicitly cast it to int, then to short, 
	and print results—demonstrate truncation or overflow.
 */
package Day6;
import java.util.Scanner;

public class Program1 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter an integer:");
		int n=s.nextInt();
		double d=n;
		System.out.println(n);
		System.out.println(d);
		
		System.out.println("Enter a double:");
		double d1=s.nextDouble();
		int i=(int)d1;
		short sh=(short)i;
		
		System.out.println(sh);
		s.close();
	}

}
/*
output:
Enter an integer:
123
123
123.0
Enter a double:
23.45
23
*/