package jdbcCon;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
//(a)Adding 5000 bonus
public class Procedure_1 {

	public static void main(String[] args) throws SQLException {
		try (Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/mydbsel","root","root")){
			CallableStatement cs=c.prepareCall("{call forBonus()}");
			ResultSet rs=cs.executeQuery();
			System.out.println("Eid\tName\tSalary");
			while(rs.next()) {
				int id=rs.getInt("eid");
				String name=rs.getString("ename");
				int sal=rs.getInt("sal");
				System.out.println(id+"\t"+name+"\t"+sal);
			}
			rs.close();
			cs.close();
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}

}
/*output:
Eid	Name	Salary
101	Neeva sharma	70000
102	Reeva Varma	75000
103	Shiva Upadhyay	70000
104	Mittal shah	75000
105	Reva	28500
1122	folo	40340
*/