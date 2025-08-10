/*
 10.	Can you simulate call by reference in Java 
 using a wrapper class or array? Justify with a program.
 */
package Day7;
public class CallByRef10 {

	public static void main(String[] args) {
		IntWrapper num = new IntWrapper(10);
        modifyValue(num);
        System.out.println("After modification: " + num.value);
	}
	static void modifyValue(IntWrapper obj) {
        obj.value = 50; 
    }
}
class IntWrapper {
    int value;
    IntWrapper(int value) {
        this.value = value;
        System.out.println("Inside constructor: "+value);
    }
}
/*
output:
Inside constructor: 10
After modification: 50
*/