package Day10;
//13. Write a program to create, move, and delete a file using Files and Paths.
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class FileMoveDelete {

	public static void main(String[] args) {
		Path filePath = Paths.get("temp.txt");
		Path newPath = Paths.get("move.txt");
		try {
			Files.createFile(filePath);
			System.out.println("File created " + filePath);

			Files.move(filePath, newPath, StandardCopyOption.REPLACE_EXISTING);                          
			System.out.println("File moved to " + newPath);

			Files.delete(newPath);
			System.out.println("File deletd "+newPath);
		} catch (IOException e) {
			System.out.println(e);
			e.printStackTrace();
		}

	}
}
/*
 File created temp.txt
File moved to move.txt
File deletd move.txt
*/
