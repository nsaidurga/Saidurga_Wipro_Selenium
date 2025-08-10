package Day8;

import java.util.ArrayList;

public class AddAll {

	public static void main(String[] args) {
		ArrayList<Integer> a=new ArrayList<>();
		a.add(30);
		a.add(28);
		a.add(10);
		a.add(18);
		a.add(51);
		a.add(11);
		a.add(23);
		
		ArrayList<Integer> r=new ArrayList<>();
		r.addAll(a);
		System.out.println(r);
	}

}
