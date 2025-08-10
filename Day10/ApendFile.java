package Day10;
/*
 15. Write a program to write data 
 into a file using Files.write() and append using StandardOpenOption.APPEND.
 */
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;

public class ApendFile {

	public static void main(String[] args) {
		Path path = Paths.get("normal.txt");
		try {
		if (!Files.exists(path)) {
			Files.createFile(path);
			System.out.println("File created");
		} 
		Files.write(path, List.of("\nwho are you?"), StandardOpenOption.APPEND);
		System.out.println("Line appended to file");
		}
		catch(IOException e) {
			System.out.println(e);
		}
	}

}
//output: Line appended to file