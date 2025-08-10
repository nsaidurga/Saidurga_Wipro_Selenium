package Day11;
//6.Write a Java program to delete a student record from the database using JDBC.
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class Program6 {
    public static void main(String[] args) {
        try (Connection con = Program1.getConnection()) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter Roll No to Delete: ");
            int rno = sc.nextInt();

            String sql = "DELETE FROM student2 WHERE rollno = ?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setInt(1, rno);

            int rows = pst.executeUpdate();
            if (rows > 0) {
                System.out.println("Record Deleted.");
            } else {
                System.out.println("Student not found.");
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
/*
output:
Connection created
Enter Roll No to Delete: 11
Record Deleted.
*/