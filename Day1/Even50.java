//4. Write a Java program to print even numbers between 1 to 50 using a for loop.

package Day1;

public class Even50 {

	public static void main(String[] args) {
		for(int i=1;i<=50;i++) {
			if(i%2==0) {
				System.out.print(i+" ");
			}
		}
		System.out.println();
		//System.out.println('A');
	}

}

/*
output:
2 4 6 8 10 12 14 16 18 20 22 24 26 28 30 32 34 36 38 40 42 44 46 48 50 
*/