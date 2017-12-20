
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

class Create
{
    public static void main(String args[])
            throws Exception
    {
        
        Class.forName("oracle.jdbc.driver.OracleDriver");
        Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","goutham");
        String str="create table pjdbc(id number(20))";
        Statement stmt=con.createStatement();
        stmt.execute(str);
        con.close();
    }
}