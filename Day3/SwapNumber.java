//3. Swap two numbers using third variable 
package Day3;
public class SwapNumber {

	public static void main(String[] args) {
		//swapping using third variable
		int a=10;
		int b=20;
		System.out.println("Numbers before swapping: "+a+" "+b);
		
		int temp=a+b;
		b=temp-b;
		a=temp-b;
	
		System.out.println("Numbers after swapping : "+a+" "+b);
		
	}

}
/*
output:
Numbers before swapping: 10 20
Numbers after swapping : 20 10
*/
