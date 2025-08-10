package hospital_ward;
import java.sql.*;
//Hospital Procedures Project
public class HospitalProcedures{
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/Mydbsel"; 
        String user = "root";
        String password = "root";

        try (Connection con = DriverManager.getConnection(url, user, password)) {
            System.out.println("Connected to DB...");

            // 1. Average patient count daily
            CallableStatement cs1 = con.prepareCall("{CALL avg_patient_count_daily()}");
            ResultSet rs1 = cs1.executeQuery();
            while (rs1.next()) {
                System.out.println("Average patients per day: " + rs1.getDouble("avg_patient_per_day"));
            }

            // 2. Patients in same ward
            CallableStatement cs2 = con.prepareCall("{CALL patients_same_ward()}");
            ResultSet rs2 = cs2.executeQuery();
            System.out.println("\nPatients in same ward:");
            while (rs2.next()) {
                System.out.println(rs2.getInt("patient_id") + " - " + rs2.getString("name") +
                                   " (Ward: " + rs2.getInt("ward_no") + ")");
            }

            // 3. Patients ordered by admission date
            CallableStatement cs3 = con.prepareCall("{CALL patients_by_admission()}");
            ResultSet rs3 = cs3.executeQuery();
            System.out.println("\nPatients by admission date:");
            while (rs3.next()) {
                System.out.println(rs3.getInt("patient_id") + " - " + rs3.getString("name") +
                                   " (Admitted: " + rs3.getDate("admission_date") + ")");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

/* output:
Connected to DB...

Average patients per day: 2.5

Patients in same ward:
1 - Kajal devgan (Ward: 101)
3 - Mrunal thakur (Ward: 101)
5 - Kareeshama kapoor (Ward: 101)

Patients by admission date:
1 - Kajal devgan (Admitted: 2025-08-01)
2 - Kareena kapoor (Admitted: 2025-08-01)
3 - Mrunal thakur (Admitted: 2025-08-01)
4 - Priyanka chopra (Admitted: 2025-08-02)
5 - Kareeshama kapoor (Admitted: 2025-08-02)
*/