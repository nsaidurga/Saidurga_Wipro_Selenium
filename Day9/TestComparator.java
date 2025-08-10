/*
 Q1. Sort a list of students by roll number (ascending) using Comparable.
Create a Student class with fields: rollNo, name, and marks. 
Implement the Comparable interface to sort students by their roll numbers.
 */
package Day9;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student2 {
	int id;
	String name;

	public Student2(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public String toString() {
		return id + " " + name;
	}

}

public class TestComparator implements Comparator<Student2>{
	public int compare(Student2 s1,Student2 s2) {
		return Integer.compare(s1.id, s2.id);
	}
	public static void main(String[] args) {
		List<Student2> list=new ArrayList<>();
		list.add(new Student2(5,"Sai"));
		list.add(new Student2(2,"Durga"));
		list.add(new Student2(6,"Akhil"));
		
		//list.sort((s1,s2)->s1.name.compareTo(s2.name));
		Collections.sort(list, new TestComparator());
		list.forEach(System.out::println);
		
	}

}
/*
output:
2 Durga
5 Sai
6 Akhil
*/