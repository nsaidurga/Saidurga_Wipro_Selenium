package Day10;
/*
 3. Write a Java program to write "Hello, World!" into a file using FileWriter.
 */
import java.io.FileWriter;
import java.io.IOException;

public class AddHello {
	public static void main(String[] args) {
		try {
			FileWriter writer = new FileWriter("test.txt");
			writer.write("Hello, World!");
			writer.close();
			System.out.println("Successfully wrote to the file.");
		} catch (IOException e) {
			System.out.println(e);
			e.printStackTrace();
		}
	}
}
//output: Successfully wrote to the file.