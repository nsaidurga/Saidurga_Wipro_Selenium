package Day11;
//9.Develop a program to sort student data in ascending order by name using SQL in JDBC.
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class Program9 {
    public static void main(String[] args) {
        try (Connection con = Program1.getConnection()) {
            String sql = "SELECT * FROM student2 ORDER BY name ASC";
            ResultSet rs = con.createStatement().executeQuery(sql);
            System.out.println("RNo\tName\t\t\tAge");
            while (rs.next()) {
                System.out.println(rs.getInt("rollno") + "\t" +
                                   rs.getString("name") + "\t\t" +
                                   rs.getInt("age"));
                                   //rs.getFloat("percentage"));
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
/*
output:
Connection created
RNo	Name			Age
104	Amit Verma		22
12	lucky sharma		21
101	Neeva Sharma		20
102	Reeva Sharma		20
103	Shiva Upadhyay		20
105	sonal sharma		28
*/