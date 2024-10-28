import java.sql.*;

public class viewTablePre {
  public static void main(String[] args) {
   try(Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/java_work","root","")){
      if(conn!=null){
        System.out.println("Established for conn1");
      }else{
        System.out.println("Not Established for conn1");
      }
      PreparedStatement ps = conn.prepareStatement("Select * from CLASSMATES");
      ResultSet res = ps.executeQuery();
      while(res.next()){
        System.out.printf("%-20s",res.getInt("roll_no"));
        System.out.printf("%-20s",res.getString("name"));
        System.out.printf("%-20s\n",res.getString("grade"));
      }
   }catch( SQLException sq){
     System.out.println(sq);
   }
  }
} 
