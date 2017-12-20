import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
 
public class preparedStatementDemo
{
 
    public static void main(String args[])
    throws Exception{
         
        Connection con;
        PreparedStatement prSt;
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            con = DriverManager.
                getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","tiger");
            String query = "insert into employee13333 values(?,?)";
            prSt = con.prepareStatement(query);
            prSt.setString(1, "deepthi");
            prSt.setInt(2, 10000);
            //count will give you how many records got updated
            int count = prSt.executeUpdate();
            System.out.println("The no of row got inserted "+count);
            //Run the same query with different values
            prSt.setString(1, "sravya");
            prSt.setInt(2, 5001);
            count = prSt.executeUpdate();
            System.out.println("The no of row got updated after 2nd insertion" +count);
            prSt.setString(1, "A");
            prSt.setInt(2, 5000);
            
            count = prSt.executeUpdate();
        } 
        catch (Exception e) {
       System.out.println("hai check the code");
       e.printStackTrace();
            // TODO Auto-generated catch block
            //e.printStackTrace();
        } 
         }
}

