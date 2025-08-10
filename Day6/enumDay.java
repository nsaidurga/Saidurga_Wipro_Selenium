/*
 1: Days of the Week
Define an enum DaysOfWeek with seven constants. Then in main(), prompt the user to input a day name and:
a)	Print its position via ordinal().
b)	Confirm if it's a weekend day using a switch or if-statement.
 */
package Day6;
import java.util.Scanner;

public class enumDay {
enum TypeDay{sunday,monday,tuesday,thursday,friday,saturday};
	public static void main(String[] args){
		//TypeDay t=TypeDay.Saturday;
		System.out.println("Enter the day in small letters:");
		Scanner sc=new Scanner(System.in);
		try {
			String input=sc.nextLine().toLowerCase();
			TypeDay t=TypeDay.valueOf(input);
			switch(t) {
			case sunday:
				System.out.println("SUNDAY");
				break;
			case monday:
				System.out.println("MONDAY");
				break;
			case tuesday:
				System.out.println("TUESDAY");
				break;
			case thursday:
				System.out.println("THURSDAY");
				break;
			case friday:
				System.out.println("FRIDAY");
				break;
			case saturday:
				System.out.println("SATURDAY");
				break;
			}
			if(t==TypeDay.saturday  || t==TypeDay.sunday) {
				System.out.println("Weekend");
			}
			else {
				System.out.println("Not a Weekend");
			}
		}
		catch(IllegalArgumentException e) {
			System.out.println(e);
		}
		
		sc.close();
	}

}
/*
 output:
 Enter the day in small letters:
sunday
SUNDAY
Weekend
*/
