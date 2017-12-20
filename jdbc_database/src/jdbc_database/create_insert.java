package jdbc_database;

//import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class create_insert {
public static void main(String args[])throws Exception
{
	Class.forName("oracle.jdbc.driver.OracleDriver");
	Connection conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","goutham");
	String name="create table students(FirstName varchar(250))";
	String ins="insert into students  values('goutham')";
	
	 Statement stmt=conn.createStatement();
	 stmt.execute(name);
	 stmt.execute(ins);
	 conn.close();
	 
			
	
		
	}
}

