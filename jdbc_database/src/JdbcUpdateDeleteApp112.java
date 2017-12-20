

        //how to update and delete rows.
import java.sql.*;
class JdbcUpdateDeleteApp112
{
public static void main(String args[])
        throws Exception
{
//accept the driver class name from system prompt into dname
//String dname=System.getProperty("driver");
//create an object to the driver class whose name is in dname
Class.forName("oracle.jdbc.driver.OracleDriver");
//connect to oracle database
Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","tiger");
//create sql stmt
Statement stmt=con.createStatement();
//execute sql stmt to update salary
int norows=stmt.executeUpdate("update employee set name='arti' where id=76");
System.out.println("no of rows updated="+norows);
//System.out.println("press any key to continue");
System.in.read();
//execute sql stmt to delete row

norows=stmt.executeUpdate("delete employee where name='harish'");
System.out.println("no of rows deleted="+norows);
//close conn
con.close();
}
}
//forgetcode.com
//programmr.com