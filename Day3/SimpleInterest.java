//5.Calculate simple interest 
package Day3;
public class SimpleInterest {

	public static void main(String[] args) {
		double principal=70000;
		double rate=4;
		double time=2;//years
		
		double interest=(principal*rate*time)/100;
		
		System.out.println("Simple Interest: "+interest);
	}

}
/*
output:
Simple Interest: 5600.0
*/