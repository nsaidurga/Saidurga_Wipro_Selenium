package Day10;
//•	10. Write a program to serialize and deserialize a Student object to and from a file.
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserialiseStudent {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		FileInputStream fos=new FileInputStream("stud.txt");
		ObjectInputStream oos=new ObjectInputStream(fos);
		Studentt s1=(Studentt)oos.readObject();
		s1.display();
		oos.close();
		fos.close();
		System.out.println("DeSerialization done successfully");
	}

}
/*
output:
	Studentt [Rollno=101, Name=Neeva Sharma]
	DeSerialization done successfully
*/