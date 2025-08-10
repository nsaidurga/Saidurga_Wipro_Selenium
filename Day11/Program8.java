package Day11;
//8.Create a JDBC-based program to count the total number of rows in a table.
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class Program8 {
    public static void main(String[] args) {
        try (Connection con = Program1.getConnection()) {
            String sql = "SELECT COUNT(*) FROM student2";
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            if (rs.next()) {
                System.out.println("Total Students: " + rs.getInt(1));
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
/*
output:
Connection created
Total Students: 6
*/