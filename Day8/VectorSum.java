package Day8;

import java.util.Enumeration;
import java.util.Vector;

public class VectorSum {
	public static void sum(Vector<Integer> v) {
		int s=0;
		for(int i:v) {
			s+=i;
		}
		System.out.println("sum: "+s);
	}
	public static void main(String[] args) {
		Vector<Integer> v=new Vector<>();
		v.add(10);
		v.add(20);
		v.add(9);
		v.add(40);
		sum(v);
		//System.out.println();
		
		Enumeration<Integer> e=v.elements();
		while(e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}
	}

}
