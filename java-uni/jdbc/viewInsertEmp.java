import java.sql.*;

public class viewInsertEmp {
  public static void main(String[] args) {
   try(Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/java_work","root","")){
      if(conn!=null){
        System.out.println("Established for conn1");
      }else{
        System.out.println("Not Established for conn1");
      }
      Statement stmt = conn.createStatement();
      ResultSet res = stmt.executeQuery("SELECT * FROM EMPLOYEE");
      while(res.next()){
        System.out.printf("%-20s",res.getInt("emp_id"));
        System.out.printf("%-20s",res.getString("emp_name"));
        System.out.printf("%-20s",res.getString("city"));
        System.out.printf("%-20s",res.getInt("salary"));
        System.out.printf("%-20s\n",res.getDate("date_of_joining"));
      }
   }catch( SQLException sq){
     System.out.println(sq);
   }
  }
}
