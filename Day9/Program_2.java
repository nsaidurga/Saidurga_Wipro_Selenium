package Day9;
/*
 Q2. Read from a File
Write a program to read the contents of student.txt and 
display them line by line using BufferedReader.
 */
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Program_2 {

	public static void main(String[] args) throws IOException {
		BufferedReader b=new BufferedReader(new FileReader("student.txt"));
		List<String> lines=new ArrayList<>();
		String l;
		while((l=b.readLine())!=null) {
			lines.add(l);
		}
		for(String s:lines) {
			System.out.println(s);
		}
	}

}
/*
output:
I am sai
I am focused
I am determined
I am good boy
I am very kindLove u saisai
*/