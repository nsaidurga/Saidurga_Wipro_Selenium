package Day10;
//9.Write a program to filter and display only .txt files from a folder using FilenameFilter.
import java.io.File;
import java.io.FilenameFilter;

public class OnlyTextFiles {
    public static void main(String[] args) {
        File folder = new File("C:\\saiweb"); 
        
        FilenameFilter filter = (dir, name) -> name.endsWith(".txt");

        String[] txtFiles = folder.list(filter);

        if (txtFiles != null && txtFiles.length > 0) {
            System.out.println(".txt files:");
            for (String file : txtFiles) {
                System.out.println(file);
            }
        } else {
            System.out.println("directory doesn't exist.");
        }
    }
}
/*output:
.txt files:
nsd.txt
nsd1.txt
sele.txt
*/