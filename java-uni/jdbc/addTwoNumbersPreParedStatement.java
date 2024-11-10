import java.sql.*;

class addTwoNumbersPreParedStatement {
  public static void main(String[] args) {
    ////String createProcedureSQL = "CREATE PROCEDURE AddTwoNumbers(IN num1 INT, "
    //                            + "IN num2 INT, OUT result INT) "
    //                            + "BEGIN "
    //                            + "	SET result = num1 + num2; "
    //                            + "END";
    int num1 = 123;
    int num2 = 456;
    try (Connection con = DriverManager.getConnection(
             "jdbc:mysql://localhost:3306/java_work", "root", "")) {
      //Statement stmt = con.createStatement();
      //stmt.execute(createProcedureSQL);
      System.out.println("Stored procedure created");

      String callProcedure = "{CALL AddTwoNumbers(?, ?, ?)}";
      CallableStatement cstmt = con.prepareCall(callProcedure);
      cstmt.setInt(1, num1);
      cstmt.setInt(2, num2);
      cstmt.registerOutParameter(3, Types.INTEGER);
      cstmt.execute();

      int sum = cstmt.getInt(3);
      System.out.println(num1 + " + " + num2 + "= " + sum);
    } catch (SQLException e) {
      e.printStackTrace();
    }
  }
}
