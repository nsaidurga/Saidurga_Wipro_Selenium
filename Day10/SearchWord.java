package Day10;
//12. Write a program to search for a specific word in a file and count its occurrences.
import java.io.File;
import java.util.Scanner;

public class SearchWord {

	public static void main(String[] args) {
		String searchWord="hii";
		int count=0;
		try {
			Scanner sc=new Scanner(new File("reverse.txt"));
			while(sc.hasNext()) {
				String word=sc.next();
				if(word.equalsIgnoreCase(searchWord)) {
					count++;
				}
			}
			System.out.println(searchWord+" occured "+count+" times");
			sc.close();
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}

}
//output: hii occured 0 times