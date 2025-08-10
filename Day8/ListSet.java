package Day8;
//Hash Set
//convert arraylist to hashset
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;

public class ListSet {

	public static void main(String[] args) {
		ArrayList<Integer> a=new ArrayList<>(List.of(23,21,9,23,12,4,11,9));
		HashSet<Integer> h=new HashSet<>(a);
		for(int i:h) {
			System.out.print(i+" ");
		}
		System.out.println();
		System.out.println(h.toString());
	}

}
/*output 4 21 23 9 11 12 
[4, 21, 23, 9, 11, 12]
*/