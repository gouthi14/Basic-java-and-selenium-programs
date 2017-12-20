import java.sql.*;

public class CreateTable{
   public static void main(String args[])
   throws Exception
   {
   
       Class.forName("oracle.jdbc.driver.OracleDriver");
       
       Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","goutham");
       
       Statement stmt=con.createStatement();

   String insert="insert into qualification values('goutham',01)";
       stmt.execute(insert);
       con.close();
       
       
       
   }
}