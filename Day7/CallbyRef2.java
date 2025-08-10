/*
 6.	Create a class Student with name and marks. 
 Write a method to update the marks of a student. 
 Demonstrate the changes in the original object.
 */
package Day7;
class Student {
	String name;
	int marks;
	Student(String name,int marks){
		this.name=name;
		this.marks=marks;
	}
}
public class CallbyRef2 {

	public static void changeM( Student c,int marks) {
		c.marks=c.marks+10;
		System.out.println("Inside method: "+c.name+" updated marks "+c.marks);
	}
	public static void main(String[] args) {
		Student s=new Student("Sai",71);
		System.out.println("Before method call: "+s.name+" have marks "+s.marks);
		changeM(s,89);
		System.out.println("After method call: "+s.name+" updated marks "+s.marks);
	}

}
/*
output:
Before method call: Sai have marks 71
Inside method: Sai updated marks 81
After method call: Sai updated marks 81
*/