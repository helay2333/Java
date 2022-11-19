import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;


public class DataBaseConnection {
 public static void main(String[] args)throws SQLException {
  Connection conn=null;
  java.sql.Statement stmt=null;
  ResultSet rs=null;
  try {
   DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
   String url="jdbc:mysql://localhost:3306/jxgl";
   String username="root";
   String password="abc123";
   conn=DriverManager.getConnection(url,username,password);
   stmt=conn.createStatement();
   String sql="select *from student";
   rs=((java.sql.Statement) stmt).executeQuery(sql);
   //System.out.println("id|name|password|email|birthday");
   while(rs.next()) {
    //int id=rs.getInt("id");
    String name=rs.getString("name");
    //String psw=rs.getString("password");
    //String email=rs.getString("email");
    //Date birthday=rs.getDate("birthday");
    //System.out.println("name:"+name+"，password:"+psw+"，email:"+email+"，birthday:"+birthday);
    System.out.println(name);
   }
   
 } catch (Exception e) {
      e.printStackTrace();
 }finally {
   rs.close();
   stmt.close();
   conn.close();
 }
}
}