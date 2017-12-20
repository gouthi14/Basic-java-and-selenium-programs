package jdbc_database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class JDBC_RETRIVING {
	public static void main(String args[])throws Exception
	{

		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","goutham");
		String sql="SELECT * FROM masters";
		
		Statement stmt=conn.createStatement();
		stmt.execute(sql);
	
		stmt.close();
		conn.close();
	}}




