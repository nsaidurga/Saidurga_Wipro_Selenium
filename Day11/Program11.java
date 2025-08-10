package Day11;
//11.Use PreparedStatement to insert multiple student records into the database.
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

class Student {
    int rollno;
    String name;
    int age;
 
    Student(int rollno, String name, int age) {
        this.rollno = rollno;
        this.name = name;
        this.age = age;
    }
}
public class Program11 {

	public static void main(String[] args) throws SQLException {
		List<Student> students = new ArrayList<>();
        students.add(new Student(101, "Neeva Sharma", 20));
        students.add(new Student(102, "Reeva Sharma", 20));
        students.add(new Student(103, "Shiva Upadhyay", 20));
        students.add(new Student(104, "Amit Verma", 22));
        students.add(new Student(105, "Sonal Mehta", 19));
        
		try (Connection con = Program1.getConnection()) {
		
            // Insert records
            String insertQuery = "INSERT INTO student2 (rollno, name, age) VALUES (?, ?, ?)";
            PreparedStatement insertPst = con.prepareStatement(insertQuery);
 
            for (Student s : students) {
                insertPst.setInt(1, s.rollno);
                insertPst.setString(2, s.name);
                insertPst.setInt(3, s.age);
                insertPst.addBatch(); // Adds this set of data to the batch
            }
 
            int[] result = insertPst.executeBatch(); // Executes all insertions
            System.out.println(result.length + " records inserted successfully.\n");
	}
		catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

}
}
/*output:
Connection created
5 records inserted successfully.
*/