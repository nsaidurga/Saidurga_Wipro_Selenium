/*
 1.Count number of vowels in a string(input=”Programming”, output=3 Vowels) 
 */
package Day3;

public class VowelCount {

	public static void main(String[] args) {
		String s="Programming";
		int count=0;
		//s=s.toLowerCase();
		
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U') {
				count++;
			}
		}
		System.out.println("Number of Vowels: "+count);
	}

}
/*
output:
Number of Vowels: 3
*/