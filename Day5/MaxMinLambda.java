/*
 8.	Create similar lambdas for max/min. 
 */
package Day5;

import java.util.function.BinaryOperator;

public class MaxMinLambda {
    public static void main(String[] args) {
        BinaryOperator<Double> maxLambda = (a, b) -> a > b ? a : b;
        BinaryOperator<Double> minLambda = (a, b) -> a < b ? a : b;

        double a = 5.6, b = 9.3;

        System.out.println("Max: " + maxLambda.apply(a, b)); // 9.3
        System.out.println("Min: " + minLambda.apply(a, b)); // 5.6
    }
}

/*
output:
Max: 9.3
Min: 5.6
*/