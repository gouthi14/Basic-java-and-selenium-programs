import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Table_Creation {

	public static void main(String[] args) 
		// TODO Auto-generated method stub
throws Exception{
		
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection conn=DriverManager.getConnection("jdbc:oracle:thin@localhost:1521:xe","system","goutham");
			String str="create table Pjdbc id number(10),name varchar(20)";
			Statement stmt=conn.createStatement();
			stmt.executeQuery(str);
			conn.close();
			
}
			
	}


