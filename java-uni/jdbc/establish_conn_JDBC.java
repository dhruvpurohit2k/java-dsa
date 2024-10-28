import java.sql.*; 

public class establish_conn_JDBC {
  public static void main(String[] args) {
   try(Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/MCA","root","")){
      if(conn!=null){
        System.out.println("Established for conn1");
      }else{
        System.out.println("Not Established for conn1");
      }
      Statement s1 = conn.createStatement();
      String query = "SHOW DATABASES";
      ResultSet r1 = s1.executeQuery(query);
      while(r1.next()){
        System.out.println(r1.getString("Database"));
      }
   }catch( SQLException sq){
     System.out.println(sq);
   }
  }
}
