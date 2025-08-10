package Day9;
/*
  Q11. Print All Files in a Directory
Write a program to list all files (not directories) inside a folder path given by the user.
 */
import java.io.File;

public class Program_11 {

	public static void main(String[] args) {
		File f=new File("C:\\saiweb\\dictionary");
		System.out.println(f.isDirectory());
		if (f.exists() && f.isDirectory()) {
		File[] a=f.listFiles();
		int c=0;
		for(File i:a) {
			if(i.isFile()) {
			System.out.println(i.getName());
			}
			c++;
		}
		System.out.println("No of files: "+c);
	}
	}
}
/*
output:
true
Dictionary.css
Dictionary.js
index.html
No of files: 4
*/