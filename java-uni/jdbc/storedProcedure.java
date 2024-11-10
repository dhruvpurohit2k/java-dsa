import java.sql.*;

class storedProcedure {
  public static void main(String[] args) {
    //String createProcedureSQL =
    //    "CREATE PROCEDURE NEW_EMPLOYEE(first char(100), last char(100), "
    //    + "birthday_input date)"
    //    + "BEGIN "
    //    + "INSERT INTO EMPLOYEE2(first_name,last_name) VALUES (first,last); "
    //    + "SET @id=(SELECT LAST_INSERT_ID()); "
    //    + "INSERT INTO BIRTHDAY(emp_id,birthday) VALUES (@id,birthday_input); "
    //    + "END";
    try (Connection con = DriverManager.getConnection(
             "jdbc:mysql://127.0.0.1:3306/java_work", "root", "")) {
      //Statement stmt = con.createStatement();
      //stmt.execute(createProcedureSQL);
      String call = "{CALL NEW_EMPLOYEE(?,?,?)}";
      CallableStatement ctmt = con.prepareCall(call);
      ctmt.setString(1, "Gaurav");
      ctmt.setString(2, "Purohit");
      ctmt.setString(3, "2005-11-03");
      ctmt.execute();
      System.out.println("Added successfully");
    } catch (SQLException e) {
      e.printStackTrace();
    }
  }
}
