//1. print even number from 2 to 50
package Day2;

public class Program_1 {

	public static void main(String[] args) {
		System.out.println("Even Numbers from 2 to 50:");
		for(int i=2;i<=50;i++) {
			if(i%2==0) {
				System.out.print(i+" ");
			}
		}
	}

}

/*
 output:
Even Numbers from 2 to 50:
2 4 6 8 10 12 14 16 18 20 22 24 26 28 30 32 34 36 38 40 42 44 46 48 50 
 */