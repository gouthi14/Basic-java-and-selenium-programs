package jdbc_database;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

class Create_Table {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		        try{
		          Class.forName("oracle.jdbc.driver.OracleDriver");
		          Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","goutham");
		        
		                  
		          String str=("create table santoshg(id number(10),name varchar(10))");
		          Statement stmt=con.createStatement();
		          stmt.execute(str);
		          System.out.println("table inserted");
		          con.close();
		        }
		                  catch(Exception e){
		                          System.out.println(e);
		                          }
		        }
		    
		

		
	}


