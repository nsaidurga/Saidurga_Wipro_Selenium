/*
 4.	Runtime Polymorphism with constructor Chaining                                                            
create a class vehicle with a constructor that prints “Vehicle Created”
Create a subclass Bike that override a method and uses super() in constructor
 */
package Day4;

class Vehicle {
	Vehicle() {
		System.out.println("Vehicle Created");
	}

	void speed() {
		System.out.println("Vehicle go on an average speed");
	}
}

class Bike extends Vehicle {
	Bike() {
		super();
		System.out.println("That vehicle is Bike");
	}

	void speed(float s) {
		System.out.println("Bikes can go on a fast speed of "+s+"km/h");
	}
}

public class ConstructorChain {

	public static void main(String[] args) {
		//Vehicle v=new Vehicle();
		Bike b=new Bike();
		b.speed(110.6f);
		
	}

}

/*
output:
Vehicle Created
That vehicle is Bike
Bikes can go on a fast speed of 110.6km/h
*/