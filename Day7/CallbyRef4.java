package Day7;
/*
 8.	Write a program where you assign a new object to a reference passed into a method. 
 Show that the original reference does not change.
 */
class Dog {
	String name;

	Dog(String name) {
		this.name = name;
	}
}

public class CallbyRef4 {
	public static void assignNewDog(Dog d) {
		d = new Dog("Bruno"); // Assigning a new object to the reference
		System.out.println("Inside method: Dog's name = " + d.name);
	}

	public static void main(String[] args) {
		Dog myDog = new Dog("Rocky");

		System.out.println("Before method call: Dog's name = " + myDog.name);
		assignNewDog(myDog);
		System.out.println("After method call: Dog's name = " + myDog.name);
	}

}
/*
output:
Before method call: Dog's name = Rocky
Inside method: Dog's name = Bruno
After method call: Dog's name = Rocky
*/