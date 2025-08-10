package Day11;
//2.Create a Java class to insert student records into a database table.
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class Program2 {
    public static void main(String[] args) {
        try (Connection con = Program1.getConnection()) {
            String sql = "INSERT INTO student2 (rollno, name, age) VALUES (?, ?, ?)";
            PreparedStatement pst = con.prepareStatement(sql);
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter Roll No: ");
            int rno = sc.nextInt();
            sc.nextLine();
            System.out.print("Enter Name: ");
            String name = sc.nextLine();
            System.out.print("Enter Age: ");
            int age = sc.nextInt();

            pst.setInt(1, rno);
            pst.setString(2, name);
            pst.setInt(3, age);

            int rows = pst.executeUpdate();
            System.out.println(rows + " record(s) inserted.");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
/*
output:
Connection created
Enter Roll No: 11
Enter Name: santu
Enter Age: 21
1 record(s) inserted.
*/