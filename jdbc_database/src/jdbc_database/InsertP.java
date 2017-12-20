package jdbc_database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class InsertP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","goutham");
			String str="insert into santoshg values(2,'keerthi')";
			Statement stmt=con.createStatement();
			stmt.executeQuery(str);
			System.out.println("data inserted");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
 