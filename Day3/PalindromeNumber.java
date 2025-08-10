package Day3;
//14. check if array is palindrome or not 
public class PalindromeNumber {

	public static void main(String[] args) {
		int[] a= {1,2,3,2,1};
		boolean isPalindrome=true;
		
		for(int i=0;i<a.length/2;i++) {
			if(a[i]!=a[a.length-1-i]) {
				isPalindrome=false;
			}
		}
		if(isPalindrome) {
			System.out.println("The array is a palindrome");
		}
		else {
			System.out.println("The array is not a palindrome");
		}
	}

}
/*
output:
The array is a palindrome
*/