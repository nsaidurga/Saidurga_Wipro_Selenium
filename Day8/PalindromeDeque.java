package Day8;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;
/* Deque
 1.	Palindrome Checker:
	Input a string and check if it is a palindrome using a Deque<Character>.
 */
public class PalindromeDeque {
	public static boolean isPalindrome(String s) {
		
		Deque<Character> d=new LinkedList<>();
		for(char c:s.toCharArray()) {
			if(Character.isLetterOrDigit(c)) {
				d.add(Character.toLowerCase(c));
			}
		}
		while(d.size()>1) {
			if(d.removeFirst()!=d.removeLast()) {
				return false;
			}
		}
		
		return true;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter string: ");
		String s="Ab % @ba";
		if(isPalindrome(s)){
			System.out.println(s+" is a Palindrome");
		}
		else {
			System.out.println(s+" is not a Palindrome");
		}
	}

}
/*
output:
Enter string: 
Ab % @ba is a Palindrome
*/