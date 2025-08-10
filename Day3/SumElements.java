//1.Write a program to find the sum of all elements in an integer array 
package Day3;
public class SumElements {

	public static void main(String[] args) {
		int[] a= {23,12,2,9,11,13};
		int sum=0;
		for(int i=0;i<a.length;i++) {
			sum+=a[i];
		}
		System.out.println("Sum of array elements: "+sum);
	}

}
/*
output:
Sum of array elements: 70
*/