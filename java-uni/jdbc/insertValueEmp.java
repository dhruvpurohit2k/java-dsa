import java.sql.*;
public class insertValueEmp {
  public static void main(String[] args) {
   try(Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/java_work","root","")){
    if(c!=null){
      System.out.println("Connection Established");
    }else{
      System.out.println("Failed to Establish Connection");
    }
    Statement stmt = c.createStatement();
    //String s = "INSERT INTO EMPLOYEE(emp_name,city,salary,date_of_joining) VALUES(\'Dhruv Purohit\',\'Ahmedabad\',1000000,\"2018-12-07\")";
    //String s = "INSERT INTO EMPLOYEE(emp_name,city,salary,date_of_joining) VALUES(\'Gaurav Purohit\',\'Ahmedabad\',1122000,\"2023-11-03\")";
    //stmt.executeUpdate(s);
    //s = "INSERT INTO EMPLOYEE(emp_name,city,salary,date_of_joining) VALUES(\'Aniket Lamba\',\'Delhi\',2000000,\"2015-02-06\")";
    //stmt.executeUpdate(s);
    String s = "INSERT INTO EMPLOYEE(emp_name,city,salary,date_of_joining) VALUES(\'Rambaby Kaushwa \',\'Ayodhaya\',1005000,\"2018-02-28\")";
    stmt.executeUpdate(s);
    s = "INSERT INTO EMPLOYEE(emp_name,city,salary,date_of_joining) VALUES(\'Deekshant Parik \',\'Jaipur\',1000000,\"2020-03-19\")";
    stmt.executeUpdate(s);
    s = "INSERT INTO EMPLOYEE(emp_name,city,salary,date_of_joining) VALUES(\'Parag Jain \',\'Jaipur\',900000,\"2020-05-29\")";
    stmt.executeUpdate(s);
    s = "INSERT INTO EMPLOYEE(emp_name,city,salary,date_of_joining) VALUES(\'Sanchit Mishra \',\'Bihar\',3900000,\"2015-01-21\")";
    stmt.executeUpdate(s);
    s = "INSERT INTO EMPLOYEE(emp_name,city,salary,date_of_joining) VALUES(\'Yashashwee \',\'Bihar\',3000000,\"2019-11-21\")";
    stmt.executeUpdate(s);
    s = "INSERT INTO EMPLOYEE(emp_name,city,salary,date_of_joining) VALUES(\'David Kumar \',\'Mumbai\',1300000,\"2010-10-22\")";
    stmt.executeUpdate(s);
    s = "INSERT INTO EMPLOYEE(emp_name,city,salary,date_of_joining) VALUES(\'Rajat Kumar\',\'Goa\',1002000,\"2020-09-12\")";
    stmt.executeUpdate(s);
   }catch(SQLException se){
     System.out.println(se);
   }
  }
}
