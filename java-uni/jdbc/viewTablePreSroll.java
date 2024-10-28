import java.sql.*;

public class viewTablePreSroll {
  public static void main(String[] args) {
   try(Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/java_work","root","")){
      if(conn!=null){
        System.out.println("Established for conn1");
      }else{
        System.out.println("Not Established for conn1");
      }
      Statement s = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_READ_ONLY);
      ResultSet res = s.executeQuery("SELECT * FROM CLASSMATES");
      System.out.println("FIRST...");
      res.first();
      System.out.println(res.getInt("roll_no") + " " + res.getString("name") + " " + res.getString("grade"));
      System.out.println("LAST...");
      res.last();
      System.out.println(res.getInt("roll_no") + " " + res.getString("name") + " " + res.getString("grade"));
      System.out.println("PREVIOUS");
      res.previous();
      System.out.println(res.getInt("roll_no") + " " + res.getString("name") + " " + res.getString("grade"));
      System.out.println("RELATIVE");
      res.relative(-2);
      System.out.println(res.getInt("roll_no") + " " + res.getString("name") + " " + res.getString("grade"));
      System.out.println("ABSOLUTE");
      res.absolute(2);
      System.out.println(res.getInt("roll_no") + " " + res.getString("name") + " " + res.getString("grade"));
   }catch( SQLException sq){
     System.out.println(sq);
   }
  }
} 
