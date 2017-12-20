//using preparedstement
import java.sql.*;
class JdbcPSApp115
{
public static void main(String args[])
        throws Exception
{
Class.forName("oracle.jdbc.driver.OracleDriver");
Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","tiger");
//create PS 
PreparedStatement ps=con.prepareStatement("insert into employee1 values(?,?)");
//calculate time before insertion
long t1=System.currentTimeMillis();
//insert 999 rows 
//for(int i=1;i<1000;i++)
//{
//set values for ? ?

ps.setString(1,"vasantha");
ps.setInt(2,55);

ps.execute();

ps.setString(1,"vasu");
ps.setInt(2,44);


//execute stmt
ps.execute();

//cal time for after insertion
long t2=System.currentTimeMillis();
System.out.println("time="+(t2-t1));
//close conection
con.close();
}
}
