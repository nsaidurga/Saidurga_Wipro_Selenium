/*
 Combined question
Create an abstract class SmartDevice with methods like turnOn(), turnOff(), and performFunction().
Create child classes:
SmartPhone: performs calling and browsing.
SmartWatch: tracks fitness and time.
SmartSpeaker: plays music and responds to voice commands.
Write code to store all objects in an array and use polymorphism to invoke their performFunction().
*/
package Day4;

abstract class SmartDevice{
	abstract void turnOn();
	abstract void turnOff();
	abstract void performFunction();
}
class SmartPhone extends SmartDevice{
	void turnOn() {
		System.out.println("SmartPhone is turned on.");
	}
	void turnOff(){
		System.out.println("SmartPhone is turned off.");
	}
	void performFunction()
	{
		System.out.println("SmartPhone: Making calls and browsing internet.");
	}
}
class SmartWatch extends SmartDevice{
	void turnOn() {
		System.out.println("SmartWatch is turned on.");
	}
	void turnOff(){
		System.out.println("SmartWatch is turned off.");
	}
	void performFunction()
	{
		System.out.println("SmartWatch: Showing time and tracking fitness.");
	}
}
class SmartSpeaker extends SmartDevice{
	void turnOn() {
		System.out.println("SmartSpeaker is turned on.");
	}
	void turnOff(){
		System.out.println("SmartSpeaker is turned off.");
	}
	void performFunction()
	{
		System.out.println("SmartSpeaker: Playing music and responds to voice commands.");
	}
}
public class SmartDeviceAbstrct {

	public static void main(String[] args) {
		SmartDevice[] devices= {
				new SmartPhone(),
				new SmartWatch(),
				new SmartSpeaker()
		};
		for(SmartDevice device:devices) {
			device.turnOn();
			device.turnOff();
			device.performFunction();
			System.out.println();
		}
	}

}

/*
output:
SmartPhone is turned on.
SmartPhone is turned off.
SmartPhone: Making calls and browsing internet.

SmartWatch is turned on.
SmartWatch is turned off.
SmartWatch: Showing time and tracking fitness.

SmartSpeaker is turned on.
SmartSpeaker is turned off.
SmartSpeaker: Playing music and responds to voice commands.

*/