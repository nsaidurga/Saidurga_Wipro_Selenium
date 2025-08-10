package Day11;
//1.Write a Java program to connect to a MySQL database using JDBC.
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Program1 {
    public static Connection getConnection(){
    	String url="jdbc:mysql://localhost:3306/MydbSel";
		String user="root";
		String password="root";

        try {
        	Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection(url,user,password);
			System.out.println("Connection created");
            return con;
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Connection Failed: " + e.getMessage());
            return null;
        }
    }

    public static void main(String[] args){
        getConnection(); 
    }
}
//output: Connection created