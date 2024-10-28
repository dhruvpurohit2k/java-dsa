import java.sql.*;

public class updateTableEmp{
  public static void main(String[] args) {
   try(Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/java_work","root","")){
      if(conn!=null){
        System.out.println("Established for conn1");
      }else{
        System.out.println("Not Established for conn1");
      }
      Statement stmt = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
      ResultSet res = stmt.executeQuery("SELECT * FROM EMPLOYEE");
      while(res.next()){
        int newval = res.getInt("salary")+50000;
        res.updateInt("salary",newval);
        res.updateRow();
      }
   }catch( SQLException sq){
     System.out.println(sq);
   }
  }
}
