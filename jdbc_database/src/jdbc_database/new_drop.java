package jdbc_database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class new_drop {
	public static void main(String args[])throws Exception
	{

		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","goutham");
		
		String name="drop index first";
		
		Statement stmt=conn.createStatement();
	
		stmt.execute(name);	
		stmt.close();
		conn.close();
	}}




