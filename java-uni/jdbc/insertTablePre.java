import java.sql.*;

public class insertTablePre {
  public static void main(String[] args) {
   try(Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/java_work","root","")){
      if(conn!=null){
        System.out.println("Established for conn1");
      }else{
        System.out.println("Not Established for conn1");
      }
      PreparedStatement ps = conn.prepareStatement("INSERT INTO CLASSMATES VALUES(?,?,?)");
      String[] names = {"Aniket Lamba","Avinash Prasad","Rambabu Kushwa","Deekshant Parik","Dhruv Purohit"};
      int[] roll = {1,27,58,7,38};
      String[] grade = {"A","A-","C","D","A+"};
      for(int i = 0; i<names.length; i++){
        ps.setInt(1,roll[i]);
        ps.setString(2,names[i]);
        ps.setString(3,grade[i]);
        ps.execute();
      }
   }catch( SQLException sq){ System.out.println(sq); }
  }
}
