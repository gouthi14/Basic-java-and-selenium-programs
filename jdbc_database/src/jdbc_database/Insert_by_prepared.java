package jdbc_database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Insert_by_prepared {

	
	public static void main(String args[])
	{
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","goutham");
			
			PreparedStatement ps=con.prepareStatement("insert into santoshg values(?,?)");
			ps.setInt(1,3);
			ps.setString(2, "venkata");
			ps.executeQuery();
			System.out.println("dara inserted ");
			
		}
		catch(Exception e){
			System.out.println(e);
		}
	}
}
