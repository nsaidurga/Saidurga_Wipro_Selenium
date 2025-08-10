package Day3;
//Check if a string is Palindrome 
public class Palindrome {

	public static void main(String[] args) {
		String str="abba";
		String temp="";
		
		for(int i=str.length()-1;i>=0;i--) {
			temp+=str.charAt(i);
		}
		if(str.equals(temp)) {
			System.out.println(str+" is palindrome");
		}
		else {
			System.out.println(str+" is not a palindrome");
		}
	}

}
/*
output:
abba is palindrome
*/