package Day3;
//4.Count words in a Sentence 
public class WordsCount {

	public static void main(String[] args) {
		String str=" All are welcome to java selenium ";
				
		String[] words=str.trim().split("\\s+");
		int wordCount=words.length;
		
		System.out.print("Number of words = ");
		System.out.println(wordCount);
	}

}
/*
output:
Number of words = 6
*/