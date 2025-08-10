package jdbcCon;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
//(c)highest and lowest salaries
public class Procedure_3 {

	public static void main(String[] args) {
		try (Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/mydbsel","root","root")){
			CallableStatement cs=c.prepareCall("{call highestLow()}");
			ResultSet rs=cs.executeQuery();
			System.out.println("Highest\tLowest");
			while(rs.next()) {
				int hig=rs.getInt("highestsal");
				//String name=rs.getString("ename");
				int lsal=rs.getInt("lowestsal");
				System.out.println(hig+"\t"+lsal);
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
Highest	Lowest
75000	28500
*/