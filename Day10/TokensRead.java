package Day10;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
//11. Write a program to read a file using Scanner and display the tokens.
public class TokensRead {

	public static void main(String[] args) throws FileNotFoundException {
		File f=new File("test.txt");
		Scanner sc=new Scanner(f);
		System.out.println("Tokens in the file:");
		while(sc.hasNext()) {
			System.out.println(sc.next());
		}
		sc.close();
	}

}
/*
output:
Tokens in the file:
Hello,
World!
This
is
an
appended
line.
*/