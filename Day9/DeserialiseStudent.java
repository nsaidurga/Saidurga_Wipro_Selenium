package Day9;
/*
  Q10. Read Serialized Object from File
Deserialize the student.txt file and display the object's content on the console.
 */
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
/*output:
Studentt [Rollno=101, Name=Neeva Sharma]
DeSerialization done successfully
*/