/*
 4.	Create a class Box with a variable length. 
 Write a method that modifies the value of length 
 by passing the Box object. Show that the original object is modified.
 */
package Day7;

public class Callbyref1 {
	int length;
	Callbyref1(int length){
		this.length=length;
	}
	public static void changeM( Callbyref1 c) {
		c.length=c.length+10;
		System.out.println("Inside method: "+c.length);
	}
	public static void main(String[] args) {
		Callbyref1 c=new Callbyref1(20);
		System.out.println("Before method call: "+c.length);
		changeM(c);
		System.out.println("After method call: "+c.length);
	}

}
/*
output:
Before method call: 20
Inside method: 30
After method call: 30
*/