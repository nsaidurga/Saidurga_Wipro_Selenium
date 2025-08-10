/*
  Q4. Count Words and Lines
Write a program to count the number of words and lines in a given text file notes.txt.

 */
package Day9;
import java.io.BufferedReader;
import java.io.FileReader;

public class Program_4 {

	public static void main(String[] args) {
		int linecount=0;
		int wordcount=0;
		
		try {
			BufferedReader b=new BufferedReader(new FileReader("student.txt"));
			String line;
			while((line=b.readLine())!=null) {
				linecount++;
				String[] words=line.trim().split("\\s+");
				if(!line.trim().isEmpty()) {
					wordcount+=words.length;	
				}
			}
			System.out.println("Total lines: "+linecount);
			System.out.println("Total words: "+wordcount);
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}

}
/*
output:
Total lines: 18
Total words: 27
*/