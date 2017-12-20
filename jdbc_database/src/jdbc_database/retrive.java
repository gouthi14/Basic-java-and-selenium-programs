package jdbc_database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class retrive {
	 public static void main(String args[])
			   throws Exception
			   {
			   
			       Class.forName("oracle.jdbc.driver.OracleDriver");
			       
			       Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","goutham");
			       
			       Statement stmt=con.createStatement();

			  ResultSet rs=stmt.executeQuery("select * from fdata");
			  while(rs.next()){
				  System.out.println(rs.getString("username")+" "+rs.getString("password"));
			  }
			       con.close();
			       
			       
			       
			   }
			}

