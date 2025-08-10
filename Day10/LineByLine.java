package Day10;
//4. Write a program to read the content of a file line by line using BufferedReader.
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LineByLine {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new FileReader("test.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println(e);
            e.printStackTrace();
        }
    }
}
/*
output:
Hello, World!
This is an appended line.
*/