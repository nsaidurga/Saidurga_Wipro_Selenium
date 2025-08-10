/*
  Q5. Copy Contents from One File to Another
Write a program to read from source.txt and write the same content into destination.txt.
 */
package Day9;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Program_5 {

	public static void main(String[] args) throws IOException {
		//FileReader f=new FileReader("")
		try {
			BufferedReader r=new BufferedReader(new FileReader("student.txt"));
			BufferedWriter w=new BufferedWriter(new FileWriter("source.txt"));
			String line;
			while((line=r.readLine())!=null) {
				w.write(line);
				w.newLine();
			}
			System.out.println("Content copied");
			w.close();
			r.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

}
//output: Content copied