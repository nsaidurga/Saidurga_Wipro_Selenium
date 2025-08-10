package Day10;
//•	5. Write a program to append a line of text to an existing file.
import java.io.FileWriter;
import java.io.IOException;

public class AppendLine {
    public static void main(String[] args) {
        try (FileWriter fw = new FileWriter("test.txt", true)) {
            fw.write("\nThis is an appended line.");
            System.out.println("Line appended successfully.");
        } catch (IOException e) {
            System.out.println(e);
            e.printStackTrace();
        }
    }
}
//output: Line appended successfully.