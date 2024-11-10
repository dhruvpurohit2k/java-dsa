import java.io.InputStream;
import java.sql.*;
import java.util.Properties;

class JDBCPrg3 {
  public static void main(String args[]) {
    try (Connection con = DriverManager.getConnection(
             "jdbc:mysql://127.0.0.1:3306/java_work", "root", "")) {
      if (con != null)
        System.out.println("Connected to database using jdbc DriverManager class");
      else
        System.out.println("Invalid username or password");
    } catch (SQLException e) {
      e.printStackTrace();
    }



    try (InputStream input =
             JDBCPrg3.class.getClassLoader().getResourceAsStream(
                 "db.properties")) {
      Properties prop = new Properties();
      if (input == null) {
        System.out.println("Unable to find db.properties");
        return;
      }
      prop.load(input);

      String url = prop.getProperty("db.url");
      String username = prop.getProperty("db.username");
      String password = prop.getProperty("db.password");

      try (Connection connection =
               DriverManager.getConnection(url, username, password)) {
        System.out.println("Connected to database using jdbc properties file");
      } catch (SQLException e) {
        e.printStackTrace();
      }
    } catch (Exception ex) {
      ex.printStackTrace();
    }
    String url = System.getenv("DB_URL");
    String username = System.getenv("DB_USERNAME");
    String password = System.getenv("DB_PASSWORD");

    try (Connection connection =
             DriverManager.getConnection(url, username, password)) {
      System.out.println("Connected to database using jdbc environment variables");
    } catch (SQLException e) {
      e.printStackTrace();
    }
  }

}
