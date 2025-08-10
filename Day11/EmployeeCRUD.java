package Day11;
//7.	Design a Java application to perform all CRUD (Create, Read, Update, Delete) operations
//on an Employee table using JDBC.
import java.sql.*;
import java.util.Scanner;

public class EmployeeCRUD {
    static Scanner sc = new Scanner(System.in);

    public static void insertEmployee(Connection con) throws SQLException {
        String sql = "INSERT INTO employee (eid, ename, sal) VALUES (?, ?, ?)";
        PreparedStatement pst = con.prepareStatement(sql);
        System.out.print("Enter ID: ");
        pst.setInt(1, sc.nextInt());
        System.out.print("Enter Name: ");
        pst.setString(2, sc.next());
        System.out.print("Enter Salary: ");
        pst.setFloat(3, sc.nextFloat());
        pst.executeUpdate();
        System.out.println("Employee inserted.");
    }

    public static void viewEmployees(Connection con) throws SQLException {
        ResultSet rs = con.createStatement().executeQuery("SELECT * FROM employee");
        System.out.println("ID\tName\tSalary\tDepartment");
        while (rs.next()) {
            System.out.println(rs.getInt("eid") + "\t" +
                               rs.getString("ename") + "\t" +
                               rs.getFloat("sal") + "\t");
        }
    }

    public static void updateEmployee(Connection con) throws SQLException {
        String sql = "UPDATE employee SET ename=?, sal=? WHERE eid=?";
        PreparedStatement pst = con.prepareStatement(sql);
        System.out.print("Enter ID to Update: ");
        int eid = sc.nextInt();
        sc.nextLine();
        System.out.print("New Name: ");
        pst.setString(1, sc.nextLine());
        System.out.print("New Salary: ");
        pst.setFloat(2, sc.nextFloat());
        pst.setInt(3, eid);
        pst.executeUpdate();
        System.out.println("Employee updated.");
    }

    public static void deleteEmployee(Connection con) throws SQLException {
        String sql = "DELETE FROM employee WHERE eid=?";
        PreparedStatement pst = con.prepareStatement(sql);
        System.out.print("Enter ID to Delete: ");
        pst.setInt(1, sc.nextInt());
        pst.executeUpdate();
        System.out.println("Employee deleted.");
    }

    public static void main(String[] args) {
        try (Connection con = Program1.getConnection()) {
            while (true) {
                System.out.println("\n1.Insert  2.View  3.Update  4.Delete  5.Exit");
                System.out.println("Enter an option: ");
                int choice = sc.nextInt();
                switch (choice) {
                    case 1 -> insertEmployee(con);
                    case 2 -> viewEmployees(con);
                    case 3 -> updateEmployee(con);
                    case 4 -> deleteEmployee(con);
                    case 5 ->   System.exit(0);
                    default -> System.out.println("Invalid option.");
                }
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
/*
output:
Connection created

1.Insert  2.View  3.Update  4.Delete  5.Exit
Enter an option: 
1
Enter ID: 12
Enter Name: lucky
Enter Salary: 23400
Employee inserted.

1.Insert  2.View  3.Update  4.Delete  5.Exit
Enter an option: 
2
ID	Name	Salary	Department
101	Neeva sharma	65000.0	
102	Reeva Varma	70000.0	
103	Shiva Upadhyay	65000.0	
104	Mittal shah	70000.0	
105	Reeva varma	50000.0	
12	lucky	23400.0
	
1.Insert  2.View  3.Update  4.Delete  5.Exit
Enter an option: 
3
Enter ID to Update: 105
New Name: Reva
New Salary: 23500
Employee updated.

1.Insert  2.View  3.Update  4.Delete  5.Exit
Enter an option: 
4
Enter ID to Delete: 12
Employee deleted.

1.Insert  2.View  3.Update  4.Delete  5.Exit
Enter an option: 
5

*/