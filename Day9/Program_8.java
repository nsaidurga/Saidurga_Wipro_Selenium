package Day9;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Program_8 {
	public static void main(String[] args){
		List<String> list=new ArrayList<>();
		try {
			BufferedReader r=new BufferedReader(new FileReader("normal.txt")) ;
			String l;
			while((l=r.readLine())!=null) {
				list.add(l);
			}
			r.close();
			for(String i:list) {
				System.out.println(i);
			}
			System.out.println();
		}
		catch (IOException e) {
	        System.out.println("Error reading file: " + e.getMessage());
	        //return;
	    }
		Collections.reverse(list);
		for(String i:list) {
			System.out.println(i);
		}
		try {
			BufferedWriter w=new BufferedWriter(new FileWriter("reverse.txt"));
			for(String l:list) {
				w.write(l+"\n");
			}
			w.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
/*
output:
Hello
Welcome to 
java learning sessionsJava is simple 
for all the learners
line 4

line 6who are you?

who are you?

who are you?

who are you?

who are you?

who are you?

who are you?

who are you?

who are you?

line 6who are you?

line 4
for all the learners
java learning sessionsJava is simple 
Welcome to 
Hello
*/