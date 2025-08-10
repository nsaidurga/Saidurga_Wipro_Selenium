package Day3;
//10.Write a program to sort characters of a String Alphabetically 
import java.util.Arrays;

public class SortChar {

	public static void main(String[] args) {
		String s="Selenium";
		
		//s.toLowerCase();
		char[] c=s.toCharArray();
		Arrays.sort(c);
		
		String s2=new String(c);
		System.out.println(s2);
	}

}
/*
output:
Seeilmnu
*/