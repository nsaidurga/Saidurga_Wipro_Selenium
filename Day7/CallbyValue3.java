package Day7;
/*
 3.	Write a Java program to pass primitive data types to a method 
 and observe whether changes inside the method affect the original variables.
 */
public class CallbyValue3 {
	public static void changeValue(char c,boolean b) {
		char c1='B';
		boolean b1=false;
		System.out.println("Inside method: "+c1+" "+b1);
	}
	public static void main(String[] args) {
		char c='A';
		boolean b=true;
		System.out.println("Before method call: "+c+" "+b);
		changeValue(c,b);
		System.out.println("After method call: "+c+" "+b);
	}

}
/*
output:
Before method call: A true
Inside method: B false
After method call: A true
*/