import java.sql.*;


public class dbconn {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection conn = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/rdm",
                    "root",
                    "RAJ@12");
            String query = "insert into ophen(serial_no, work) VALUES(?,?)";
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setInt(1, 22);
            ps.setString(2, "sql connected in java");
            ps.executeUpdate();
            System.out.println("Data Inserted");
            ps.close();
            conn.close();
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }
}
