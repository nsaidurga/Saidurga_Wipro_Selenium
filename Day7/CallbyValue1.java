package Day7;
/*
 1.	Write a program where a method accepts an integer parameter 
 and tries to change its value. Print the value before and after the method call.
 */
public class CallbyValue1 {
	public static void changeValue(int n) {
		n=n+10;
		System.out.println("Inside method: "+n);
	}
	public static void main(String[] args) {
		int x=40;
		System.out.println("Before method call: "+x);
		changeValue(x);
		System.out.println("After method call: "+x);
	}

}
/*
output:
Before method call: 40
Inside method: 50
After method call: 40
*/