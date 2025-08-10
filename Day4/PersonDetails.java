/*
 4.
Design an abstract class Person with fields like name, age, and abstract method getRoleInfo().
Create subclasses:
Student: has course and roll number.
Professor: has subject and salary.
TeachingAssistant: extends Student and implements getRoleInfo() in a hybrid way.
Create and print info for all roles using overridden getRoleInfo().
 */
package Day4;

abstract class Person {
	String name;
	int age;

	abstract void getRoleInfo();

}

class Student extends Person {
	void getRoleInfo() {
		System.out.println("Student has course and roll number");
	}
}

class Professor extends Person {
	void getRoleInfo() {
		System.out.println("Professor has subject and salary");
	}
}

class TeachingAssistant extends Student {
	void getRoleInfo() {
		System.out.println("TeachingAssistant has course and salary");
	}
}

public class PersonDetails {

	public static void main(String[] args) {
		Student s = new Student();
		Professor p = new Professor();
		TeachingAssistant t = new TeachingAssistant();

		s.getRoleInfo();
		p.getRoleInfo();
		t.getRoleInfo();
	}

}
/*
output:
Student has course and roll number
Professor has subject and salary
TeachingAssistant has course and salary
*/