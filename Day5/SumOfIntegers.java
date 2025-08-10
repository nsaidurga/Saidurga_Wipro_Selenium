/*
 1.Using lambda, give sum of two integers
 */
package Day5;

import java.util.function.BiFunction;

public class SumOfIntegers {

	public static void main(String[] args) {
		BiFunction<Integer,Integer,Integer> sum=(a,b)->a+b;
		int result=sum.apply(10, 20);
		System.out.println("Sum: "+result);
	}

}

/*
 output:
 Sum: 30
*/