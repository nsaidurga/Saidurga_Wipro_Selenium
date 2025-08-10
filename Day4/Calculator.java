/*
 1.	Create a class Calculator with the following overloaded add()
1.add(int a, int b)
2.add(int a, int b, int c)
3.add(double a, double b)

 */
package Day4;

public class Calculator {
	void add(int a, int b) {
		System.out.println("Addition of two integers: ");
		System.out.println(a+b);
	}

	void add(int a, int b,int c) {
		System.out.println("Addition of two integers: ");
		System.out.println(a+b+c);
	}

	void add(double a, double b) {
		System.out.println("Addition of two integers: ");
		System.out.println(a+b);
	}

	public static void main(String[] args) {
		Calculator c=new Calculator();
		c.add(10, 30);
		c.add(50, 20, 80);
		c.add(17.4, 10.6);
	}

}
/*
output:
.........After 12th Career Paths...........
Career options after Intermediate: Engineering, Medical, Others
You choose engineering
Engineering groups: IT, Mechanical, Cs
You choose IT
*/