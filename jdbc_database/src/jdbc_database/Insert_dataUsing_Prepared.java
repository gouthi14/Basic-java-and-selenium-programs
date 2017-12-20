package jdbc_database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Insert_dataUsing_Prepared {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		try{
			
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","goutham");
			PreparedStatement ps=con.prepareStatement("select * from santoshg");
			
			ResultSet rs = ps.executeQuery();

			while (rs.next()) {

				String userid = rs.getString("ID");
				String username = rs.getString("NAME");
				
				System.out.println("userid : " + userid);
				System.out.println("username : " + username);
				
		}
		}
		catch(Exception e){
			System.out.println(e);
		}
	}

}
