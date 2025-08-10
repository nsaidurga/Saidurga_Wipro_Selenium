package Day10;
//1. Write a program to create a new text file named test.txt.
import java.io.File;
import java.io.IOException;

public class CreateNewFile {
    public static void main(String[] args) {
        File file = new File("test.txt");
        try {
            if (file.createNewFile()) {
                System.out.println("File created: " + file.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println(e);
            e.printStackTrace();
        }
    }
}
//output: File already exists.