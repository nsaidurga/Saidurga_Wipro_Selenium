package Day3;
//9.Write a Program to count digits, letters, spaces and Special characters 
public class CountAll {

	public static void main(String[] args) {
		String a="The world! , is yours 123";
		
		int lettersCount=0,digCount=0,spacesCount=0,specialCount=0;
		
		for(int i=0;i<a.length();i++) {
			char ch=a.charAt(i);
			
			if(Character.isLetter(ch)) {
				lettersCount++;
			}
			else if(Character.isDigit(ch)) {
				digCount++;
			}
			else if(Character.isSpaceChar(ch)) {
				spacesCount++;
			}
			else {
				specialCount++;
			}
		}
		
		System.out.println("Letters: "+lettersCount);
		System.out.println("Digits: "+digCount);
		System.out.println("Spaces: "+spacesCount);
		System.out.println("Special Characters: "+specialCount);
	}

}
/*
output:
Letters: 15
Digits: 3
Spaces: 5
Special Characters: 2
*/