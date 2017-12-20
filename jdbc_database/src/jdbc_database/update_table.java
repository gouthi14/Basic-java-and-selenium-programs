package jdbc_database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class update_table {
	
	public static void main(String args[], Object stmt)throws Exception
	{

		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","goutham");
		
		    String name="update masters set firstname='harish' where id='1'";
		Statement st=conn.createStatement();
		
		st.execute(name);	
		st.close();
		conn.close();
	}}


