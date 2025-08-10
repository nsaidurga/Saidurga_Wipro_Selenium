package Day8;
import java.util.ArrayList;
/*
9. Store Custom Objects
Write a program to:
•	Create a class Student with fields: id, name, and marks.
•	Create an ArrayList of Student objects.
•	Add at least 3 students.
•	Display the details using a loop.
 */
class Student {
	int id;
	String name;
	int marks;

	Student(int id,String name,int marks){
		this.id=id;
		this.name=name;
		this.marks=marks;
	}
}

public class CustomStudList {

	public static void main(String[] args) {
		
		 ArrayList<Student> a=new ArrayList<>();
		 
		 a.add(new Student(112,"Sai",89));
		 a.add(new Student(122,"Nikhil",83));
		 a.add(new Student(133,"Durga",77));
		 
		 System.out.println("Student details:");
		 for(Student s:a) {
			 System.out.println(s.id+" "+s.name+" "+s.marks);
		 }
		 //System.out.println(a)
	}
}
/*output:
Student details:
112 Sai 89
122 Nikhil 83
133 Durga 77
*/