package jdbc_database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class new_create {
	public static void main(String args[])throws Exception
		{

			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","goutham");
			String name="create table phoneBook(FirstName varchar(250),LastName varchar(250),lineNumber number(20),id number(10))";
			String ins="INSERT INTO phoneBook VALUES('goutham','goud','5712365755',101)";
			Statement stmt=conn.createStatement();
			
			stmt.execute(name);	
			stmt.execute(ins);
			stmt.close();
			conn.close();
		}}



