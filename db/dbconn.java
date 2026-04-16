import java.sql.*;

public class dbconn {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/student",
                    "root",
                    "RAJ@12");

            if (conn != null) {
                System.out.println("MYSQL CONNECTED SUCCESFULLY");
            } else {
                System.out.println("Failed");
            }

            Statement stmt = conn.createStatement();

            // create a new db
            String createDB = "CREATE DATABASE IF NOT EXISTS student";
            stmt.executeUpdate(createDB);
            System.out.println("DB created");
            stmt.execute("USE student");
            // String query = "insert into ophen(serial_no, work) VALUES(?,?)";

            // creating tables
            String createTable = "create table if not exists student(" + "Id INT PRIMARY KEY, " + "Name VARCHAR(50),"
                    + "Marks INT)";
            stmt.execute(createTable);
            System.out.println("Table created");
            String queryInsert = "INSERT INTO STUDENT(Id,Name,Marks) VALUES(?,?,?)";
            String queryD = "SELECT * FROM STUDENT";
            stmt.execute(queryD);
            // PreparedStatement ps2 = conn.prepareStatement(createTable);
            PreparedStatement ps = conn.prepareStatement(queryInsert);
            // 3rd row

            ps.setInt(1, 3);
            ps.setString(2, "Ashutosh");
            ps.setInt(3, 98);

            ps.setInt(1, 4);
            ps.setString(2, "Rishav Raj");
            ps.setInt(3, 70);

            int row = ps.executeUpdate();
            if (row > 0) {
                System.out.println("Data Inserted");
            } else {
                System.out.println("Insertion Failed");
            }

            String query = "SELECT * FROM student";
            ResultSet rs = stmt.executeQuery(query);

            System.out.println("\n===== DATA FROM DATABASE =====");
            System.out.println("ID\tName\tMarks");
            System.out.println("----------------------------");

            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                int marks = rs.getInt("marks");
                System.out.println(id + "\t" + name + "\t" + marks);
            }

            rs.close();
            stmt.close();
            stmt.close();
            ps.close();
            conn.close();
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }
}

