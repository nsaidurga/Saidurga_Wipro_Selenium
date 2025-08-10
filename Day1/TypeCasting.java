//4.What is type casting? Provide an example of implicit and explicit casting in Java.

package Day1;

/*Type casting is conversion of one datatype to another
There are two types of Type casting:
(1)Widening casting: Conerting small datatype into large datatype
(2)Narrowing casting: Conerting large datatype into small datatype
*/
public class TypeCasting {

	public static void main(String[] args) {
		//Widening casting//automatically done by compiler
		int a=10;
		double d=a;
		
		//Narrowing casting//Manually done by user
		
		//double b=47.01d;
		//int i=(int)b;
		int i=(int)d;
		
		System.out.println(d);
		System.out.println(i);
		
		//data loss
		int val=150;
		byte bt=(byte)val;
		System.out.println(bt);
		
		
	}

}
