package Day11;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLNonTransientConnectionException;
import java.sql.SQLSyntaxErrorException;
import java.util.Scanner;
//13.Write a JDBC program to handle exceptions (like invalid ID, connection errors) gracefully.
public class Program13 {

	public static void main(String[] args) throws SQLException {
		try (Connection con = Program1.getConnection()) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter Student ID to search: ");
            int id = sc.nextInt();

            String sql = "SELECT * FROM student2 WHERE rollno=?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setInt(1, id);

            ResultSet rs = pst.executeQuery();

            if (rs.next()) {
                System.out.println("ID: " + rs.getInt("rollno"));
                System.out.println("Name: " + rs.getString("name"));
                System.out.println("Age: " + rs.getInt("age"));
                System.out.println("Percentage: " + rs.getInt("percent"));
            } else {
                System.out.println("No student found with ID " + id);
            }
            sc.close();

        } catch (SQLSyntaxErrorException e) {
            System.out.println("SQL Error " + e.getMessage());
        } catch (SQLNonTransientConnectionException e) {
            System.out.println(e);
        } catch (SQLException e) {
            System.out.println("SQL Error" + e.getMessage());
        } catch (Exception e) {
            System.out.println("Unexpected Error " + e.getMessage());
        }
		}
	}
/*
output:
Connection created
Enter Student ID to search: 102
ID: 102
Name: Reeva Sharma
Age: 20
Percentage: 89
*/