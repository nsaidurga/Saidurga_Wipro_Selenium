package Day8;

import java.util.ArrayList;
import java.util.LinkedList;
//Convert LinkedList to ArrayList
public class LinkedConversion {

	public static void main(String[] args) {
		LinkedList<String> ln=new LinkedList<>();
		ln.add("Red");
		ln.add("Blue");
		ln.add("Green");
		ln.add("Black");
		ArrayList<String> ln1=new ArrayList<>(ln);
		System.out.println("Linked list: "+ln);
		System.out.println("Array list: "+ln1);
	}

}
/*
output:
Linked list: [Red, Blue, Green, Black]
Array list: [Red, Blue, Green, Black]
*/