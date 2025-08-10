/*
  Q3. Append Data to a File
Write a Java program to append a new student name to the 
existing student.txt file without overwriting existing data.
 */
package Day9;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Program_3 {

	public static void main(String[] args) throws IOException{
		Scanner c=new Scanner(System.in);
		System.out.println("Enter student name to append:");
		String sname=c.nextLine();
		try {
			BufferedWriter b=new BufferedWriter(new FileWriter("student.txt",true));
			b.newLine();
			b.write(sname);
			b.newLine();
			System.out.println("Student name appended successfully");
			b.close();
		}
		catch(Exception e) {
			System.out.println(e);
		}
		c.close();
	}

}
