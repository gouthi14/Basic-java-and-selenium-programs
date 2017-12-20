//insert row in a table
import java.sql.*;
class JdbcInsertApp111 
{
public static void main(String args[])
        throws Exception
{
    
    String driverName="oracle.jdbc.driver.OracleDriver";
    String url="jdbc:oracle:thin:@localhost:1521:xe";
    String userName="system";
    String password="tiger";
    
    
//register oracledriver
Class.forName(driverName);
Connection con=DriverManager.getConnection(url,userName,password);
//create stmt to insert a row with only eno value as77
Statement stmt=con.createStatement();
int norows=stmt.executeUpdate("insert into jdbc values(1003,'bindu',123456)");
//stmt.executeUpdate("insert into jdbc values(987,'aaaa',111)");
System.out.println("no of rows effected="+norows);
System.out.println("=============================");
//insert a row with eno,ename and sal val
int nrows1=stmt.executeUpdate("insert into jdbc values(1024,'bindu2',50000)");
System.out.println("no of rows affected="+nrows1);
System.out.println("==================================");
//close connection
con.close();
}
}
