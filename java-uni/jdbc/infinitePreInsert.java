import java.sql.*;
import java.util.Scanner;

public class infinitePreInsert {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    try (Connection conn = DriverManager.getConnection(
             "jdbc:mysql://localhost:3306/java_work", "root", "")) {
      if (conn != null) {
        System.out.println("Established for conn1");
      } else {
        System.out.println("Not Established for conn1");
      }
      String viewRecords = "SELECT * FROM CLASSMATES";
      PreparedStatement pstmt = conn.prepareStatement(viewRecords);
      ResultSet res = pstmt.executeQuery();
      System.out.println("Currently Stored Values");
      while (res.next()) {
        System.out.printf("%-20s", res.getInt("roll_no"));
        System.out.printf("%-20s", res.getString("name"));
        System.out.printf("%-20s\n", res.getString("grade"));
      }
      PreparedStatement ps =
          conn.prepareStatement("INSERT INTO CLASSMATES VALUES(?,?,?)");
      String choice = "n";
      while (true) {
        System.out.println("Enter y to add record or n to quit");
        choice = sc.next();
        if (choice.equals("n"))
          break;
        else if (choice.equals("y")) {
          System.out.println("Enter roll number ");
          String data = sc.next();
          ps.setInt(1, Integer.parseInt(data));
          System.out.println("Enter name ");
          sc.nextLine();
          data = sc.nextLine();
          ps.setString(2, data);
          System.out.println("Enter grade ");
          data = sc.next();
          ps.setString(3, data);
          ps.execute();
        } else {
          System.out.println("Wrong input");
        }
      }
      res = pstmt.executeQuery();
      System.out.println("After adding Values");
      while (res.next()) {
        System.out.printf("%-20s", res.getInt("roll_no"));
        System.out.printf("%-20s", res.getString("name"));
        System.out.printf("%-20s\n", res.getString("grade"));
      }
    } catch (SQLException sq) {
      System.out.println(sq);
    }
    sc.close();
  }
}
