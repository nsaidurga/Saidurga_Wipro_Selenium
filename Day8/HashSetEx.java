package Day8;
import java.util.HashSet;
/* 3.Write a method that takes a HashSet<Integer> and returns the maximum element.
 */
public class HashSetEx {
	public static int maxx(HashSet<Integer> h) {
		int max=Integer.MIN_VALUE;
		for(int i:h) {
			if(i>max) {
				max=i;
			}
		}
		return max;
	}
	public static void main(String[] args) {
		HashSet<Integer> h=new HashSet<Integer>();
		h.add(10);
		h.add(37);
		h.add(13);
		h.add(10);
		System.out.println("Maximum number: "+maxx(h));
	}

}
//output: Maximum number: 37