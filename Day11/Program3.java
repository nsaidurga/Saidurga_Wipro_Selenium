package Day11;
/*
 3.	Write a JDBC program to fetch and display all student records from the database.
 */
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class Program3 {
    public static void main(String[] args) {
        try (Connection con = Program1.getConnection()) {
            String query = "SELECT * FROM student2";
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(query);

            System.out.println("RNo\tName\tAge");
            while (rs.next()) {
                System.out.println(rs.getInt("rollno") + "\t" +
                                   rs.getString("name") + "\t" +
                                   rs.getInt("age"));
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
/*
output:
Connection created
RNo	Name	Age
101	Neeva Sharma	20
102	Reeva Sharma	20
103	Shiva Upadhyay	20
104	Amit Verma	22
105	Sonal Mehta	19
12	lucky	21
*/