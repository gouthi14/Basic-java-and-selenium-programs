package jdbc_database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
public class create_prestatement {
	public static void main(String args[])
	        throws Exception
	{
	Class.forName("oracle.jdbc.driver.OracleDriver");
	Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","goutham");
	//long t1=System.currentTimeMillis();
	PreparedStatement ps=con.prepareStatement("CREATE TABLE persons(firstName varchar(250),lastName varchar(240),depertment varchar(250),id number(10))");


	ps.execute();
	
	long t2=System.currentTimeMillis();
	//System.out.println("time="+(t2-t1));
	
	con.close();
	}
}



