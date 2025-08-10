package Day10;
//17. Write a program to copy a file using Files.copy() with REPLACE_EXISTING option.
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class Copy {

	public static void main(String[] args) throws IOException {
		Path p = Paths.get("new.txt");
		if (Files.exists(p)) {
			PrintWriter w = new PrintWriter(new PrintWriter("new.txt"));
			w.write("how are you");
			w.close();
		} else {
			// create new file
			Files.createFile(p);
			System.out.println("File created");
		}
		// copy file
		Path copypath = Paths.get("user.txt");
		Files.copy(p, copypath, StandardCopyOption.REPLACE_EXISTING);
		System.out.println("File copied");
	}

}
//output: File created
//File copied