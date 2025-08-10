package Day10;
//16. Write a program to walk through a directory tree and display file names using Files.walk().
import java.io.IOException;
import java.nio.file.*;

public class Walk {
    public static void main(String[] args) {
        Path path = Paths.get("C:\\saiweb\\Dictionary");

        try {
            Files.walk(path)
                 .forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
/*
output:
C:\saiweb\Dictionary\Dictionary.css
C:\saiweb\Dictionary\Dictionary.js
C:\saiweb\Dictionary\index.html
*/