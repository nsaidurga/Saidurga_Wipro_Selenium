/*
 3.Create a base class Vehicle with method start().
Derive Car, Bike, and Truck from it and override the start() method.
Create a static method that accepts Vehicle type and calls start().
Pass different vehicle objects to test polymorphism.
 */
package Day4;
class Vehicle1 {
	void start() {
		System.out.println("Every vehicle can start with specific instrument");
	}
}
class Car extends Vehicle1 {
	void start() {
		System.out.println("A Car could start with key");
	}
}
class Bike1 extends Vehicle1 {
	void start() {
		System.out.println("A Bike will start with key or kick");
	}
}
class Truck extends Vehicle1 {
	void start() {
		System.out.println("A Truck start with key only");
	}
}
public class VehiclePassingObj {
	static void startVehicle(Vehicle1 v) {
		v.start();
	}
	public static void main(String[] args) {
		Vehicle1 car=new Car();
		Vehicle1 bike=new Bike1();
		Vehicle1 truck=new Truck();
		
		startVehicle(car);
		startVehicle(bike);
		startVehicle(truck);
	}

}
/*
output:
A Car could start with key
A Bike will start with key or kick
A Truck start with key only
*/