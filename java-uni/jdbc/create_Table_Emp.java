import java.sql.*;

public class create_Table_Emp {
  public static void main(String[] args) {
    try (Connection conn = DriverManager.getConnection(
             "jdbc:mysql://localhost:3306/java_work", "root", "")) {
      if (conn != null) {
        System.out.println("Established for conn1");
      } else {
        System.out.println("Not Established for conn1");
      }
      Statement stmt = conn.createStatement();
      String q = "CREATE TABLE EMPLOYEE" +
                  "( emp_id bigint primary key auto_increment," +
                  "emp_name varchar(100)," + 
                  "city varchar(100),"+
                  "salary int," +
                  "date_of_joining date);";
      stmt.executeUpdate(q);
      System.out.println("Table created Successfully");
    } catch (SQLException sq) {
      System.out.println(sq);
    }
  }
}
