/*
 8: Calculator Operations Enum
Create enum Operation (PLUS, MINUS, TIMES, DIVIDE) with an eval(double a, double b) method.
Implement two versions:
a)	One using a switch(this) inside eval.
b)	Another using constant-specific method overrides for eval.
Compare both designs.

 */
package Day6;
enum OperationSwitch{
	PLUS,MINUS,TIMES,DIVIDE;
	
	public double eval(double a,double b) {
		switch(this) {
		case PLUS:
			return a+b;
		case MINUS:
			return a-b;
		case TIMES:
			return a*b;
		case DIVIDE:
			if(b==0) throw new ArithmeticException("Division by zero");
			return a/b;
		default:
			throw new AssertionError("Unknown opertaion: "+this);
		}
	}
}
public class CalculatorTest {

	public static void main(String[] args) {
		double a=10,b=2;
		for(OperationSwitch op:OperationSwitch.values()) {
			System.out.println(op+":"+op.eval(a,b));
		}
	}

}

/*
output:
PLUS:12.0
MINUS:8.0
TIMES:20.0
DIVIDE:5.0
*/