package Day3;
//2. Write a program to count even and odd numbers from an array 
public class EvenOdd {

	public static void main(String[] args) {
		int[] a= {44,43,23,12,2,9,11,13};
		int evenCount=0,oddCount=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]%2==0) {
				evenCount++;
			}
			else {
				oddCount++;
			}
		}
		System.out.println("Even count: "+evenCount);
		System.out.println("Odd count: "+oddCount);
	}

}
/*
output:
Even count: 3
Odd count: 5
*/