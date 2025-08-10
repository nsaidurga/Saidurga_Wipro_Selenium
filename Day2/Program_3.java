//3. calculate sum of first 50 numbers
package Day2;
public class Program_3 {

	public static void main(String[] args) {
		System.out.println("Sum of first 50 numbers:");
		int sum=0;
		for(int i=0;i<=50;i++) {
			sum+=i;
		}
		System.out.println(sum);
	}
}

/*
output:
Sum of first 50 numbers:
1275
*/