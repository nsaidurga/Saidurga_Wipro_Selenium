package Day9;
/*
  Q10. Use an anonymous inner class to sort a list of strings by length.
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class InnerClassSort {

	public static void main(String[] args) {
		List<String> names=new ArrayList<String>();
		names.add("Elephant");
        names.add("Cat");
        names.add("Giraffe");
        names.add("Ant");
        names.add("Dolphin");
        
        Collections.sort(names,new Comparator<String>(){
        	public int compare(String s1,String s2) {
            	return Integer.compare(s1.length(),s2.length());
            }
        });
        for(String n:names) {
        	System.out.println(n);
        }
	}

}
/*output:
Cat
Ant
Giraffe
Dolphin
Elephant
*/