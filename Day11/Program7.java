package Day11;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
//write a program for order the students by their percentage.
public class Program7 {
    public static void main(String[] args) {
        try (Connection con = Program1.getConnection()) {
            String sql = "SELECT * FROM student ordered by percent asc";
            PreparedStatement pst = con.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();

            System.out.println("RNo\tName\tAge\tPercentage");
            while (rs.next()) {
                System.out.println(rs.getInt("rno") + "\t" +
                                   rs.getString("name") + "\t" +
                                   rs.getInt("age") + "\t" +
                                   rs.getFloat("percentage"));
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
/* output:
Connection created
RNo	 Name	        Age Percentage 
123	 Kumar varma	    25	72.0
12	 lucky sharma	21	80.0
104	 Amit Verma	    22	83.0
101	 Neeva Sharma	20	85.0
102	 Reeva Sharma	20	89.0
105	 sonal sharma	28	90.0
103	 Shiva Upadhyay	20	91.0
*/
