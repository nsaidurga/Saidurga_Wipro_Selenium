/*
 1. Student with Grade Validation & Configuration
Ensure marks are always valid and immutable once set.
•	Create a Student class with private fields: name, rollNumber, and marks.
•	Use a constructor to initialize all values and enforce marks to be between 0 and 100; invalid values reset to 0.
•	Provide getter methods, but no setter for marks (immutable after object creation).
•	Add displayDetails() to print all fields.

In future versions, you might allow updating marks only via a special inputMarks(int newMarks) method that has stricter logic (e.g. cannot reduce marks). Design accordingly.

 */
package Day5;

class Student {
	private String name;
	private int rollNumber, marks;

	Student(String name, int rollNumber, int marks) {
		this.name = name;
		this.rollNumber = rollNumber;
		if (isValidMarks(marks)) {
			this.marks = marks;
		} else {
			this.marks = 0;
		}
	}

	private boolean isValidMarks(int marks) {
		return marks >= 0 && marks <= 100;
	}

	String getName() {
		return name;
	}

	int getRollNumber() {
		return rollNumber;
	}

	int getMarks() {
		return marks;
	}

	void displayDetails() {
		System.out.println("Name: " + name);
		System.out.println("Roll Number: " + rollNumber);
		System.out.println("Marks: " + marks);
	}

	void inputMarks(int newmarks) {
		if (isValidMarks(newmarks) && newmarks > marks) {
			this.marks = newmarks;
		}
	}
}

public class StudentEx {

	public static void main(String[] args) {
		System.out.println("*******Student1********");
		Student s = new Student("Ravi", 324, 87);
		s.displayDetails();
		System.out.println("*******Student2********");
		Student s1 = new Student("Kumar", 421, 68);
		s1.displayDetails();
	}

}

/*
output:

*******Student1********
Name: Ravi
Roll Number: 324
Marks: 87
*******Student2********
Name: Kumar
Roll Number: 421
Marks: 68


*/