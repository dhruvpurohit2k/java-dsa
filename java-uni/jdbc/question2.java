import java.sql.*;

class question2 {
  public static void main(String args[]) {
    try (Connection conn1 = DriverManager.getConnection(
             "jdbc:mysql://127.0.0.1:3306/java_work", "root", "");
         Connection conn2 = DriverManager.getConnection(
             "jdbc:mysql://127.0.0.1:3306/mysql", "root", "");
         Connection conn3 = DriverManager.getConnection(
             "jdbc:mysql://127.0.0.1:3306/MCA", "root", "")) {
          if(conn1!=null)
            System.out.println("Connection Established With java_work");
          else 
            System.out.println("Connection Failed for java_work");
          if(conn2!=null)
            System.out.println("Connection Established With mysql");
          else 
            System.out.println("Connection Failed for mysql");
          if(conn3!=null)
            System.out.println("Connection Established With MCA");
          else 
            System.out.println("Connection Failed for MCA");
    } catch (SQLException e) {

      e.printStackTrace();
    }
  }
}
