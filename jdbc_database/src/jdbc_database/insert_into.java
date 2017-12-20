package jdbc_database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class insert_into {
	
	public static void main(String args[])throws Exception
	{

		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","goutham");
		//String sql="SELECT * FROM masters";
		String name="INSERT INTO phoneBook VALUES ('naresh','reddy','9685967503','107')";
		String ins="INSERT INTO phoneBook VALUES ('ashok','yadav','9652666000','106')";
		
		Statement stmt=conn.createStatement();
		//stmt.execute(sql);
		stmt.execute(name);	
		stmt.close();
		conn.close();
	}}
