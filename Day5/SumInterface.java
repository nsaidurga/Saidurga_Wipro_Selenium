/*
 2.	Define a functional interface SumCalculator { int sum(int a, int b); } and a lambda expression to sum two integers.
 */
package Day5;
interface SumCalculator{
	int sum(int a,int b);
}
public class SumInterface {

	public static void main(String[] args) {
		SumCalculator add=(a,b)->a+b;
		System.out.println("Sum: "+add.sum(30, 10));
	}

}

/*
 output:
 sum: 40 
 */