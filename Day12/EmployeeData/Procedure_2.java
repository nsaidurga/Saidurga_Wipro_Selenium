package jdbcCon;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
//(b)same name employees
public class Procedure_2 {

	public static void main(String[] args) {
		try (Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/mydbsel","root","root")){
			CallableStatement cs=c.prepareCall("{call sameName()}");
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
102	Reeva Varma	75000
111	Reeva Varma	39000
*/