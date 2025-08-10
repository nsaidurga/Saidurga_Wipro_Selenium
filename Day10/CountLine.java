package Day10;
//6. Write a program to count the number of lines, words, and characters in a file.
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CountLine {
    public static void main(String[] args) {
        int lineCount = 0, wordCount = 0, charCount = 0;

        try (BufferedReader br = new BufferedReader(new FileReader("test.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                lineCount++;
                String[] words = line.split("\\s+");
                wordCount += words.length;
                charCount += line.length();
            }
            System.out.println("Lines: " + lineCount);
            System.out.println("Words: " + wordCount);
            System.out.println("Characters: " + charCount);
        } catch (IOException e) {
            System.out.println(e);
            e.printStackTrace();
        }
    }
}
/*
output:
Lines: 2
Words: 7
Characters: 38
*/