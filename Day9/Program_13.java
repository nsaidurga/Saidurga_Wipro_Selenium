package Day9;
/*
 Q13. Word Search in a File
Ask the user to enter a word and check whether it exists in the file notes.txt.
 */
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Program_13 {

	public static void main(String[] args) {
		Scanner c=new Scanner(System.in);
		System.out.println("Enter a word for search:");
		String sname=c.nextLine();
		boolean found=false;
		try {
			BufferedReader r=new BufferedReader(new FileReader("source.txt"));
			String line;
			while((line=r.readLine())!=null) {
				if(line.contains(sname)) {
					found=true;
					break;
				}
			}
			r.close();
		}catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
		if(found) {
			System.out.println("found");
		}
		else {
			System.out.println("Not found");
		}
	}

}

/*
output:
Enter a word for search:
am
found
*/