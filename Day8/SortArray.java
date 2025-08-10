package Day8;

import java.util.ArrayList;
import java.util.Collections;

public class SortArray {

	public static void main(String[] args) {
		ArrayList<Integer> a=new ArrayList<>();
		a.add(30);
		a.add(28);
		a.add(10);
		a.add(18);
		a.add(51);
		a.add(11);
		a.add(23);
	
		Collections.sort(a);
		System.out.println("Sorted list: "+a);
		Collections.reverse(a);
		System.out.println("Reversed list: "+a);
		
		ArrayList<String> s=new ArrayList<>();
		s.add("Math");
		s.add("Physics");
		s.set(0, "Statistics");
		System.out.println(s);
		
		s.clear();
		System.out.println(s.size());
	}

}
