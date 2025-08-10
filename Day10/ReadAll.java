//14. Write a program to read all lines of a file using Files.readAllLines() and print them.
package Day10;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class ReadAll {

	public static void main(String[] args) {
		Path path=Paths.get("reverse.txt");
		try {
			List<String> lines=Files.readAllLines(path);
			for(String l:lines) {
				System.out.println(l);
			}
		}
		catch (IOException e) {
            System.out.println(e);
            e.printStackTrace();
	}

}
}
/*
output:
who are you?

who are you?

who are you?

who are you?

line 6who are you?

line 4
for all the learners
java learning sessionsJava is simple 
Welcome to 
Hello
*/
