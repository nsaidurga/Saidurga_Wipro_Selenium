package Day3;
//6.Split a sentence into words 
public class SplitWords {

	public static void main(String[] args) {
		String str=" Good morning all of you ";
		
		String[] words=str.trim().split("\\s+");
		int n=words.length;
		
		for(int i=0;i<n;i++) {
			System.out.println(words[i]);
		}
		//System.out.println(n);
	}

}
/*
output:
Good
morning
all
of
you
*/