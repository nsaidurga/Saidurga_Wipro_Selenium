package Day9;
/*
 Q1. Create and Write to a File
Write a Java program to create a file named student.txt and 
write 5 lines of student names using FileWriter.
 */
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Program_1 {

	public static void main(String[] args) throws IOException {
		String s="sai";
		File f=new File("student.txt");
		FileWriter f1=new FileWriter(f); 
		f1.write("I am sai\n");
		f1.write("I am focused\n");
		f1.write("I am determined\n");
		f1.write("I am good boy\n");
		f1.write("I am very kind");
		f1.write("Love u sai");
		f1.write(s);
		f1.close();
		
	}

}
