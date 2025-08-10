package Day10;
//	2. Write a program to check whether a file exists at a given path.
import java.io.File;
import java.util.Scanner;

public class FileExists {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter file path: ");
        String path = sc.nextLine();

        File file = new File(path);
        if (file.exists()) {
            System.out.println("File exists.");
        } else {
            System.out.println("File does not exist.");
        }
        sc.close();
    }
}
/*
output:
Enter file path: c:/sai
File does not exist.
*/