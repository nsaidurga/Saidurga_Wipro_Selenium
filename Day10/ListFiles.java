package Day10;
//•	8. Write a program that lists all the files in a directory.
import java.io.File;

public class ListFiles {
    public static void main(String[] args) {
        File folder = new File("c:\\saiweb\\Dictionary");  

        if (folder.exists() && folder.isDirectory()) {
            File[] files = folder.listFiles();
            System.out.println("Files in directory:");
            for (File file : files) {
                if (file.isFile()) {
                    System.out.println(file.getName());
                }
            }
        } else {
            System.out.println("Directory does not exist.");
        }
    }
}
/*
output:
Files in directory:
Dictionary.css
Dictionary.js
index.html
*/