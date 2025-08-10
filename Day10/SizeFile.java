package Day10;
//18.Write a program to check and print the size of a file in bytes using Files.size().
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class SizeFile {

	public static void main(String[] args) throws IOException {
		Path f=Paths.get("test.txt");
		
		System.out.println(Files.size(f));
	}

}
//output: 39