package jdbc_database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Resultset_jdbc_p {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		try{
			
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","goutham");
			PreparedStatement ps=con.prepareStatement("select * from jdbc222");
			ResultSet rs=ps.executeQuery();
			while(rs.next())
			{
				String id=rs.getString("id");
				String name=rs.getString("name");
				String addree=rs.getString("addree");
				
				System.out.println("your table details");
				System.out.println("uesr id is : "+id);
				System.out.println("user name: "+name);
				System.out.println("user address :"+addree);
				
			}
			
			
		}catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
