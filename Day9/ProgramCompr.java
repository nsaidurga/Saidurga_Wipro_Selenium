package Day9;
/*
 Q6. Sort a list of students by marks (descending) using Comparator.
Create a Comparator class or use a lambda expression to sort by marks.
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student1{
	int id;
	String name;
	int marks;
	public Student1(int id, String name, int marks) {
		super();
		this.id = id;
		this.name = name;
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "Student1 [id=" + id + ", name=" + name + ", marks=" + marks + "]";
	}
	
}
class MarksDescend implements Comparator<Student1>{

	@Override
	public int compare(Student1 o1, Student1 o2) {
		// TODO Auto-generated method stub
		return Integer.compare(o2.marks, o1.marks);
	}
}
public class ProgramCompr {

	public static void main(String[] args) {
		 List<Student1> students = new ArrayList<>();
	        students.add(new Student1(101, "Alice", 78));
	        students.add(new Student1(102, "Bob", 85));
	        students.add(new Student1(103, "Charlie", 67));
	        students.add(new Student1(104, "David", 92));
	        
	    // Collections.sort(students,new MarksDescend());
	     students.sort((s1, s2) -> Integer.compare(s2.marks, s1.marks));
	     //students.sort((s1, s2) -> s2.marks - s1.marks);  // more concise
	     students.forEach(System.out::println);
	}

}
/*
output:
Student1 [id=104, name=David, marks=92]
Student1 [id=102, name=Bob, marks=85]
Student1 [id=101, name=Alice, marks=78]
Student1 [id=103, name=Charlie, marks=67]
*/