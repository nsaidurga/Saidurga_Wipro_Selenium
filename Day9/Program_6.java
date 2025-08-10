package Day9;
/*
 Q6. Check if a File Exists and Display Properties
Create a program to check if report.txt exists. If it does, display its:
•	Absolute path
•	File name
•	Writable (true/false)
•	Readable (true/false)
•	File size in bytes
 */
import java.io.File;

public class Program_6 {

	public static void main(String[] args) {
		File f=new File("normal.txt");
		if(f.exists()) {
			System.out.println("File name: "+f.getName());
			System.out.println("File Location: "+f.getAbsolutePath());
			System.out.println("File size: "+f.length());
			System.out.println("File readable: "+f.canRead());
			System.out.println("File Writable: "+f.canWrite());
		}
		else {
			System.out.println("File not found");
		}
	}

}
/*
output:
File name: normal.txt
File Location: C:\Users\sai durga\workspaces\corejavaworkspaces\Selenium\normal.txt
File size: 165
File readable: true
File Writable: true
*/