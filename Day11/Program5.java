package Day11;
//5.Implement an update operation to modify student details in the database using JDBC.
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class Program5 {
    public static void main(String[] args) {
        try (Connection con = Program1.getConnection()) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter Roll No to Update: ");
            int rno = sc.nextInt();

            System.out.print("Enter New Name: ");
            String name = sc.next();
            System.out.print("Enter New Age: ");
            int age = sc.nextInt();

            String sql = "UPDATE student2 SET name = ?, age = ? WHERE rollno = ?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, name);
            pst.setInt(2, age);
            pst.setInt(3, rno);

            int rows = pst.executeUpdate();
            if (rows > 0) {
                System.out.println("Record Updated.");
            } else {
                System.out.println("No student found with that Roll No.");
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
/*
output:
Connection created
Enter Roll No to Update: 105
Enter New Name: sonal
Enter New Age: 28
Record Updated.
*/