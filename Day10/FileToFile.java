package Day10;
/*
 7. Write a program to copy content from one file to another 
 using FileReader and FileWriter.
 */
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileToFile {
    public static void main(String[] args) {
        try (FileReader reader = new FileReader("source.txt");
             FileWriter writer = new FileWriter("destination.txt")) {

            int character;
            while ((character = reader.read()) != -1) {
                writer.write(character);
            }

            System.out.println("Content copied successfully.");
        } catch (IOException e) {
            System.out.println(e);
            e.printStackTrace();
        }
    }
}
//output: Content copied successfully.