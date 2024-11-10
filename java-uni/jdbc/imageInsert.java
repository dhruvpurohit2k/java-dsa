import java.sql.*;
import java.io.*;

public class imageInsert {
  public static void main(String[] args) {
    try(Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/java_work","root","")){
      if(c!=null) System.out.println("Connected to the Database");
      InputStream is = new FileInputStream(new File("/home/dhruv/Pictures/bill_gatesjpg"));
      PreparedStatement ps = c.prepareStatement("INSERT INTO PERSON_PHOTO VALUES(?,?,?)");
      ps.setString(1,"Bill");
      ps.setString(2,"Gates");
      ps.setBlob(3,is);
      ps.execute();
      System.out.println("Successfully inserted image into the Table");
    }catch(Exception e){
      e.printStackTrace();
    }
  }
}
