/*
7: Difficulty Level & Game Setup
Define enum Difficulty with EASY, MEDIUM, HARD.
Write a Game class that takes a Difficulty and prints logic like:
•	EASY → 3000 bullets, MEDIUM → 2000, HARD → 1000.
Use a switch(diff) inside constructor or method.
 */
package Day6;
enum Difficulty{
	EASY,MEDIUM,HARD
}
class Game{
	private int bullets;
	public Game(Difficulty difficulty) {
		switch(difficulty) {
		case EASY:
			bullets=3000;
			break;
		case MEDIUM:
			bullets=2000;
			break;
		case HARD:
			bullets=1000;
			break;
		}
		System.out.println("Difficulty: "+difficulty);
		System.out.println("Bullets assigned: "+bullets);
	}
}
public class GameSetup {

	public static void main(String[] args) {
		new Game(Difficulty.EASY);
		new Game(Difficulty.MEDIUM);
		new Game(Difficulty.HARD);
	}

}
/*
output:
Difficulty: EASY
Bullets assigned: 3000
Difficulty: MEDIUM
Bullets assigned: 2000
Difficulty: HARD
Bullets assigned: 1000
*/