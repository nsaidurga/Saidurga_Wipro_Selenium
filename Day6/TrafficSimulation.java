/*
 6: Traffic Light State Machine
Implement enum TrafficLight implementing interface State, with constants RED, GREEN, YELLOW.
Each must override State next() to transition in the cycle.
Simulate and print six transitions starting from RED.

 */
package Day6;

interface State{
	State next();
}
enum TrafficLight implements State{
	RED{
		public State next() {
			return YELLOW;
		}
	},
	GREEN{
		public State next() {
			return RED;
		}
	},
	YELLOW{
		public State next() {
			return GREEN;
		}
	};
}
public class TrafficSimulation {

	public static void main(String[] args) {
		State current=TrafficLight.RED;
		System.out.println("Traffic Light Simulation:");
		for(int i=0;i<6;i++) {
			System.out.println("Current: "+current);
			current=current.next();
		}
	}

}
/*
output:
Traffic Light Simulation:
Current: RED
Current: YELLOW
Current: GREEN
Current: RED
Current: YELLOW
Current: GREEN
*/