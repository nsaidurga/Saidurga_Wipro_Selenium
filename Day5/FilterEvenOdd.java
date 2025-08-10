//4.	Filter Even or Odd Numbers 
package Day5;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterEvenOdd {

	public static void main(String[] args) {
		List<Integer> numbers=Arrays.asList(18,15,21,32,40,55,68);
		List<Integer> even=numbers.stream().filter(n->n%2==0).collect(Collectors.toList());
		List<Integer> odd=numbers.stream().filter(n->n%2==1).collect(Collectors.toList());
		System.out.println("Even Numbers: "+even);
		System.out.println("Odd Numbers: "+odd);
	}

}

/*
output:
Even Numbers: [18, 32, 40, 68]
Odd Numbers: [15, 21, 55]
*/