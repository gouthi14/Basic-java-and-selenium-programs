/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.sql.*;
/**
 *
 * @author Java
 */
public class InsertExample {
    public static void main(String args[]) throws Exception
    {
        Class.forName("oracle.jdbc.driver.OracleDriver");
    Connection con= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","tiger");
    Statement str = con.createStatement();
    String s="insert into amit  values(4444)";
           str.execute(s);
    String str1="insert into amit1234 values(2,'aaa')";
    str.execute(str1);
    con.close();
    
   }
}
