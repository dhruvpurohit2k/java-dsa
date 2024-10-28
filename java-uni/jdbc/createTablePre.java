import java.sql.*;

public class createTablePre {
  public static void main(String[] args) {
   try(Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/java_work","root","")){
      if(conn!=null){
        System.out.println("Established for conn1");
      }else{
        System.out.println("Not Established for conn1");
      }
      String s = "CREATE TABLE CLASSMATES"+
                  "(roll_no int,"+
                  "name varchar(100),"+
                  "grade varchar(2));";
      PreparedStatement ps = conn.prepareStatement(s);
      ps.execute();
   }catch( SQLException sq){
     System.out.println(sq);
   }
  }
}
