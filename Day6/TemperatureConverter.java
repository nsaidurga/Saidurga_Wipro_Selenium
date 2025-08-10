/*
 Mini Project – Temperature Converter 
1.	Prompt user for a temperature in Celsius (double).
2.	Convert it to Fahrenheit:
double fahrenheit = celsius * 9/5 + 32;
3.	Then cast that fahrenheit to int for display.
4.	Print both the precise (double) and truncated (int) values, and comment on precision loss.
 */
package Day6;
import java.util.Scanner;

public class TemperatureConverter {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter an integer:");
		double celcius=s.nextDouble();
		double fah=celcius*9/5+32;
		int tempFah=(int)fah;
		
		System.out.println(fah);
		System.out.println(tempFah);
	}

}
/*
output:
Enter an integer:
12
53.6
53
*/