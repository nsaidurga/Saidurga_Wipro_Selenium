//10. Print Fibonacci series up to 10 terms 1 2 3 5...
package Day2;
import java.util.Scanner;

public class Program_10 {
	public static void fibonacci(int n) {
		int fib1=0,fib2=1;
		System.out.println("Fibonacci series upto "+n+" terms:");
		for(int i=1;i<=n;i++) {
			System.out.print(fib1+" ");
			int result=fib1+fib2;
			fib1=fib2;
			fib2=result;
		}
	}
	public static void main(String[] args) {
		System.out.println("Enter the number of terms:");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		fibonacci(n);
	}

}
/*
output:
Enter the number of terms:
7
Fibonacci series upto 7 terms:
0 1 1 2 3 5 8 
*/