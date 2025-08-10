/*
 2: Compass Directions
Create an enum Direction with the values NORTH, SOUTH, EAST, WEST. Write code to:
a)	Read a Direction from a string using valueOf().
b)	Use switch or if to print movement (e.g. “Move north”).
Test invalid inputs with proper error handling.

 */
package Day6;
import java.util.Scanner;

public class CompassDirection {
	enum Direction{
		NORTH,SOUTH,EAST,WEST
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a direction (NORTH, SOUTH, EAST, WEST): ");
		String input=sc.nextLine().trim();
		try {
			Direction d=Direction.valueOf(input.toUpperCase());
			switch(d) {
			case NORTH:
				System.out.println("Move north");
				break;
			case SOUTH:
				System.out.println("Move south");
				break;
			case EAST:
				System.out.println("Move east");
				break;
			case WEST:
				System.out.println("Move west");
				break;
			}
		}catch(Exception e) {
			System.out.println("Invalid directon entered!");
		}
		sc.close();
	}

}
/*
output:
Enter a direction (NORTH, SOUTH, EAST, WEST): north
Move north
*/