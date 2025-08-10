package Day7;
/*
 2.	Create a method that takes two integer values and swaps them. 
 Show that the original values remain unchanged after the method call.
 */
public class CallValue2 {
	public static void changeValue(int x,int y) {
		x=x+y;
		y=x-y;
		x=x-y;
		
		System.out.println("Inside method x,y: "+x+" "+y);
	}
	public static void main(String[] args) {
		int x=10;
		int y=20;
		System.out.println("Before method call: "+x+" "+y);
		changeValue(x,y);
		System.out.println("After method call: "+x+" "+y);
	}

}
/*
output:
Before method call: 10 20
Inside method x,y: 20 10
After method call: 10 20
*/