package Day9;
/*
 Q5. Implement a program that sorts a list of custom objects using Comparable,
  and displays them before and after sorting.
 */
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class StudentComparable implements Comparable<StudentComparable> {
	int id;
	String name;

	public StudentComparable(int id, String name) {
		//super();
		this.id = id;
		this.name = name;
	}
	//for compare int id
	/*
	public int compareTo(Student s) {
		return id - s.id; 
	}
	*/
	//for compare string name
	public int compareTo(StudentComparable s) {
		return this.name.compareTo(s.name);
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}

	public static void main(String[] args) {
		List<StudentComparable> l=Arrays.asList(new StudentComparable(9,"Sai"),
				new StudentComparable(2,"Durga"),
				new StudentComparable(6,"Akhil")
				);
		Collections.sort(l);
		l.forEach(System.out::println);
	}

}
/*
  output:
Student [id=6, name=Akhil]
Student [id=2, name=Durga]
Student [id=9, name=Sai]
*/
