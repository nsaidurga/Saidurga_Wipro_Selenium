//4. print multiplication table for 17
package Day2;
public class Program_4 {

	public static void main(String[] args) {
		System.out.println("Multiplication table for 17 :");
		
		int a=17;
		for(int i=1;i<=10;i++) {
			System.out.println(a+" * "+i+" = "+i*a);
		}
		
	}

}
/*
output:
Multiplication table for 17 :
17 * 1 = 17
17 * 2 = 34
17 * 3 = 51
17 * 4 = 68
17 * 5 = 85
17 * 6 = 102
17 * 7 = 119
17 * 8 = 136
17 * 9 = 153
17 * 10 = 170
*/