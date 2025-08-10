package Day8;
import java.util.List;
import java.util.Vector;
/* Vector
•	Create a Vector of integers and perform the following operations:
•	Add 5 integers to the Vector.
•	Insert an element at the 3rd position.
•	Remove the 2nd element.
•	Display the elements using Enumeration.
•	Create a Vector of Strings and:
•	Add at least 4 names.
•	Check if a specific name exists in the vector.
•	Replace one name with another.
•	Clear all elements from the vector.
•	Write a program to:
•	Copy all elements from one Vector to another Vector.
•	Compare both vectors for equality.
•	Write a method that takes a Vector<Integer> and returns the sum of all elements.
 */
public class VectorEx {
	public static void sum(Vector<Integer> h) {
		int total=0;
		for(int i:h) {
			total+=i;
		}
		System.out.println(total);
	}
	public static void main(String[] args) {
		Vector<String> v=new Vector<String>();
		v.add(null);
		v.add("Orange");
		v.add("Blue");
		v.add("White");
		v.add("Black");
		v.add(4, "Gray");
		v.add(null);
		v.add("Red");
		System.out.println(v);
		System.out.println(v.indexOf("Red"));
		System.out.println(v.subList(0, 2));
		System.out.println(v.addAll(0, v));
		System.out.println(v.capacity());
		v.add("End");
		//System.out.println(v.capacity());
		
		System.out.println(v.containsAll(v));
		System.out.println(v.elementAt(3));
		System.out.println(v.get(3));
		System.out.println(v.equals("End"));
		System.out.println(v.firstElement());
		System.out.println(v.getFirst());
		System.out.println(v.remove("End"));
		System.out.println(v);
		System.out.println(v.toString());
		//System.out.println(v.toArray());
		
		v.insertElementAt("Indigo", 7);
		System.out.println(v);
		
		Vector<String> v1=new Vector<String>(v);
		System.out.println(v.equals(v1));
		
		Vector<Integer> s=new Vector<Integer>(List.of(12,23,4,5,54,65));
		System.out.println("Sum of elements: ");
		sum(s);
	}

}
