/*
1.	create multilevel inheritance for
Vehicle
Four_wheeler
Petrol_Four_Wheeler
FiveSeater_Petrol_Four_Wheeler
Baleno_FiveSeater_Petrol_Four_Wheeler
*/

package Day4;

abstract class Vehicle12 {
	abstract void show();

}

class Four_wheeler extends Vehicle12 {
	void show() {
		System.out.println("It is a four wheeler vehicle.");
	}
}

class Petrol_Four_wheeler extends Four_wheeler{
	void show() {
		super.show();
		System.out.println("It runs on petrol.");
	}
}

class FiveSeater_Petrol_Four_Wheeler extends Petrol_Four_wheeler {
	void show() {
		super.show();
		System.out.println("It have five seats.");
	}
}

class Baleno_FiveSeater_Petrol_Four_Wheeler extends FiveSeater_Petrol_Four_Wheeler {
	void show() {
		super.show();
		System.out.println("It is a model of Baleno.");
	}

}

public class MultilevelInheritance {

	public static void main(String[] args) {
		System.out.println("*****Baleno Car******");
		Baleno_FiveSeater_Petrol_Four_Wheeler car=new Baleno_FiveSeater_Petrol_Four_Wheeler();
		car.show();
	}

}
/*
output:
*****Baleno Car******
It is a four wheeler vehicle.
It runs on petrol.
It have five seats.
It is a model of Baleno.
*/