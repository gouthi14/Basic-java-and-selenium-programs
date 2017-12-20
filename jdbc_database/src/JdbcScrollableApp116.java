//using scrollable result sets
import java.sql.*;
class JdbcScrollableApp116
{
public static void main(String args[])
throws Exception{
Class.forName("oracle.jdbc.driver.OracleDriver");
Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","tiger");
//create scroll sensitive ,scrollable result set
Statement stmt=con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
//execute query
ResultSet rs=stmt.executeQuery("select * from employee");
//display all the rows from result set
while(rs.next())
{
System.out.println(rs.getString(1));
System.out.println(rs.getString(2));
//System.out.println(rs.getInt(2));

System.out.println("====last()===");
System.out.println(rs.getString(1));
//System.out.println(rs.getInt(2));
//System.out.println(rs.getInt(3));
//System.out.println(rs.getString(4));
//System.out.println(rs.getString(5));
//System.out.println("------");

//display 3rd row
//rs.absolute(3);
//System.out.println(rs.getInt(3));
//wait till enter pressed
//System.in.read();
//find how many rows are there 
//rs.last();
System.out.println("No of rows="+rs.getRow());
//wait till enter pressed
System.in.read();
//make a query again
rs=stmt.executeQuery("select * from emp");
System.out.println("=======the rows from emp======");
while(rs.next())
{
    System.out.println(rs.getInt(1));
System.out.println(rs.getString(2));
System.out.println(rs.getInt(3));
//System.out.println(rs.getString(4));
System.out.println("=====");
}
System.in.read();
//update 3rd row in resultset and stor in db
rs=stmt.executeQuery("select id from Minal222");
System.out.println("=======the rows from Minal222======");
while(rs.next())
{
if(rs.getInt(1) == 1){
                    rs.updateString(2,"eswar");
                    rs.updateRow();
                    System.out.println("successfully updated");
                //rs.updateInt(3,45);
}
}
//rs.updateRow(1,"jsh");


//wait till enter pressed

//inser a new row
//rs=stmt.executeQuery("select sno,sname from Minal222");
//System.out.println("=======inserting rows in to Minal222======");
//while(rs.next())
//{
//rs.moveToInsertRow();
//rs.updateString(1,"111");
//rs.updateString(2,"ANA");
//rs.updateInt(3,8500);
//rs.insertRow();
//}
//wait till enter pressed
System.in.read();
//delete 4th row
//close the result set
rs.close();
//close the connection()
con.close();
}
}
}