/*
 7.	Create a program to show that Java is strictly "call by value" 
 even when passing objects (object references are passed by value).
 */
package Day7;
class Car{
	String model;
	Car(String m){
		this.model=m;
	}
}
public class Proof {
	public static void change(Car c) {
		c.model="Tesla";
		c =new Car("BMW");
		System.out.println("Inside method:model =  "+c.model);
	}
	public static void main(String[] args) {
		Car c=new Car("Toyota");
		System.out.println("Before method call: "+c.model);
		change(c);
		System.out.println("After method call: "+c.model);
	}

}
/*
output:
Before method call: Toyota
Inside method:model =  BMW
After method call: Tesla
*/