package jdbc_database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

 class sample_database 
{
public static void main(String args[])throws Exception
{

	Class.forName("oracle.jdbc.driver.OracleDriver");
	Connection conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","goutham");
	String name="create table aaa(id number(10))";
	
	Statement stmt=conn.createStatement();
	
	stmt.execute(name);	
	stmt.close();
	conn.close();
}}
