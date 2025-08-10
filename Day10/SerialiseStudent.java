//•	10. Write a program to serialize and deserialize a Student object to and from a file.
package Day10;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Studentt implements Serializable{
	int id;
	String name;
	public Studentt(int id, String name) {
		//super();
		this.id = id;
		this.name = name;
	}
	
	public void display() {
		System.out.println( "Studentt [Rollno=" + id + ", Name=" + name + "]");
	}
	
}

public class SerialiseStudent {

	public static void main(String[] args) throws IOException {
		Studentt s1=new Studentt(101,"Neeva Sharma");
		FileOutputStream fos=new FileOutputStream("stud.txt");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(s1);
		oos.close();
		fos.close();
		System.out.println("Serialization successfully");
	}

}
//output: Serialization successfully