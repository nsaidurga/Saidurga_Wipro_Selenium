package Day11;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;
//14.Create a login system using JDBC where user credentials are verified from the database.
public class Program15 {

	public static void main(String[] args) throws SQLException {
		try (Connection con = Program1.getConnection()) {
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter Username: ");
			String uname = sc.nextLine();
			System.out.print("Enter Password: ");
			String pwd = sc.nextLine();

			String sql = "SELECT * FROM users WHERE username=? AND password=?";
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setString(1, uname);
			pst.setString(2, pwd);

			ResultSet rs = pst.executeQuery();

			if (rs.next()) {
				System.out.println("Login Successful! Welcome " + uname);
			} else {
				System.out.println("Invalid credentials! Try again.");
			}
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}

}
/*
output:
Connection created
Enter Username: sai
Enter Password: sai123
Login Successful! Welcome sai
*/