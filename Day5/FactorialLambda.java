/*
 9.Factorial lambda program
 */
package Day5;

import java.util.function.Function;

public class FactorialLambda {

	public static void main(String[] args) {
		Function<Integer,Integer> f=(n)->{
			int fact=1;
			for(int i=2;i<=n;i++) {
				fact*=i;
			}
			return fact;
		};
		int number=5;
		System.out.println("Factorial of "+number+" is "+f.apply(number));
	}

}

/*
output:
Factorial of 5 is 120
*/