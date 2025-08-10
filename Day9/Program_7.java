/*
  Q7. Create a File and Accept User Input
Accept input from the user (using Scanner) and write the input to a file named userinput.txt
 */
package Day9;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Program_7 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter string data");
		String s=sc.nextLine();
		try {
			BufferedWriter w=new BufferedWriter(new FileWriter("user.txt"));
			w.write(s);
			System.out.println("input get successfully");
			w.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		sc.close();
	}

}
/*
output:
Enter string data
fdgsh
input get successfully
*/