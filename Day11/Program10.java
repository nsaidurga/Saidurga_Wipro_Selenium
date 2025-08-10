/*
 10.Write a program to display all students whose percentage is 
 greater than 75 using JDBC and SQL WHERE clause.
 */
package Day11;
import java.sql.Connection;
import java.sql.ResultSet;

import java.sql.Connection;
import java.sql.ResultSet;

public class Program10 {

	public static void main(String[] args) {
		try (Connection con = Program1.getConnection()) {
            String sql = "SELECT * FROM student2 where percent > 75";
            ResultSet rs = con.createStatement().executeQuery(sql);
            System.out.println("RNo\tName\t\t\tAge\t\tPercentage");
            while (rs.next()) {
                System.out.println(rs.getInt("rollno") + "\t" +
                                   rs.getString("name") + "\t\t" +
                                   rs.getInt("age")+"\t\t" +
                                   rs.getInt("percent"));
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
	}

}
/*
output:
Connection created
RNo	Name			Age		Percentage
101	Neeva Sharma		20		85
102	Reeva Sharma		20		89
103	Shiva Upadhyay		20		91
104	Amit Verma		22		83
105	sonal sharma		28		90
12	lucky sharma		21		80
*/