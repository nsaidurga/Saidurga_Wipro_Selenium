package Day3;
//7.Write a program to find the frequency of each character in a string 
public class Frequency {

	public static void main(String[] args) {
		String input = "Hello World";

        input = input.toLowerCase().replaceAll(" ", ""); 

        int[] freq = new int[256]; 
        
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            freq[ch]++;
        }

        System.out.println("Frequency of each character: ");
        
        for (int i = 0; i < 256; i++) {
            if (freq[i] > 0) {
                System.out.println((char)i + " → " + freq[i]);
            }
        }
	}

}
/*
output:
Frequency of each character: 
d → 1
e → 1
h → 1
l → 3
o → 2
r → 1
w → 1
*/