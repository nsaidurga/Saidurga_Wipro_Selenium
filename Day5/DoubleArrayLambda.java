
 //7.	 Aggregate Operations (Sum, Max, Average) on Double Arrays

package Day5;
import java.util.Arrays;

public class DoubleArrayLambda {
    public static void main(String[] args) {
        Double[] arr = {12.5, 45.7, 23.4, 67.8, 9.2};

        double[] sum = {0};
        double[] max = {arr[0]};

        Arrays.asList(arr).forEach(n -> {
        	sum[0] += n;
            if (n > max[0]) max[0] = n;
        });

        double avg = sum[0] / arr.length;

        System.out.println("Sum: " + sum[0]);
        System.out.println("Max: " + max[0]);
        System.out.println("Average: " + avg);
    }
}

/*
output:
Sum: 158.59999999999997
Max: 67.8
Average: 31.71999999999999
*/