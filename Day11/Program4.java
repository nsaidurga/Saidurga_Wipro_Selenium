package Day11;
//4.Develop a program to search a student by ID using JDBC.
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class Program4 {
    public static void main(String[] args) {
        try (Connection con = Program1.getConnection()) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter Roll No to Search: ");
            int rno = sc.nextInt();

            String sql = "SELECT * FROM student2 WHERE rollno = ?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setInt(1, rno);
            ResultSet rs = pst.executeQuery();

            if (rs.next()) {
                System.out.println("Found: " + rs.getString("name") + ", Age: " + rs.getInt("age"));
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
Enter Roll No to Search: 12
Found: lucky, Age: 21
*/