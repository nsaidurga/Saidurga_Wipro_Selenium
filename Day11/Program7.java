package Day11;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.PreparedStatement;

public class Program7 {
    public static void main(String[] args) {
        try (Connection con = Program1.getConnection()) {
            String sql = "SELECT * FROM student WHERE percentage > ?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setFloat(1, 75);
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
