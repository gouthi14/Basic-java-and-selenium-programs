package jdbc_database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class delete_prestatement {
public static void main(String args[])throws Exception

{
Class.forName("oracle.jdbc.driver.OracleDriver");
Connection conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","goutham");
PreparedStatement ps=conn.prepareStatement("delete phoneBook where id='222222'");
long t1=System.currentTimeMillis();
ps.execute();
long t2=System.currentTimeMillis();
System.out.println("time="+(t2-t1));
conn.close();
}
}
