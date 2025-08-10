/*
 4. Extended Interface Hierarchy

•	Define interface BaseVehicle with method void start().
•	Define interface AdvancedVehicle that extends BaseVehicle, adding method void stop() and boolean refuel(int amount).
•	Implement Car to satisfy both interfaces; include a constructor initializing fuel level.
•	In Main, manipulate the object via both interface types.

 */
package Day5;

interface BaseVehicle {
	void start();
}

interface AdvancedVehicle extends BaseVehicle {
	void stop();

	boolean refuel(int amount);
}

class Car implements AdvancedVehicle {
	private int fuelLevel;

	public Car(int initialFuel) {
		this.fuelLevel = Math.max(initialFuel, 0);
	}

	public void start() {
		if (fuelLevel > 0) {
			System.out.println("Car started. Fuel level: " + fuelLevel);
		} else {
			System.out.println("Cannot start. No fuel.");
		}
	}

	public void stop() {
		System.out.println("Car stopped.");
	}

	public boolean refuel(int amount) {
		if (amount <= 0) {
			System.out.println("Refuel failed: Invalid amount.");
			return false;
		}
		fuelLevel += amount;
		System.out.println("Refused " + amount + "units. Total fuel: " + fuelLevel);
		return true;
	}

}

public class CarExample {
	public static void main(String[] args) {
		BaseVehicle b = new Car(0);
		b.start();

		AdvancedVehicle a = (AdvancedVehicle) b;
		a.refuel(20);
		a.start();
		a.stop();
	}
}

/*
 output:
 Cannot start. No fuel.
Refused 20units. Total fuel: 20
Car started. Fuel level: 20
Car stopped.

 */