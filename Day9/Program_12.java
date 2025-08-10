package Day9;
/*
  Q12. Delete a File
Write a program to delete a file (given by file name) if it exists.
 */
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Program_12 {

	public static void main(String[] args) throws IOException {
		Path p = Paths.get("new.txt");
		Files.deleteIfExists(p);
		System.out.println("Files deleted.");
	}

}
//output: Files deleted.