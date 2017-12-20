/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Java
 */
public class StringDemo
{

    public static void main(String args[])
    {
        
    
    String s="hello";
String s1=new String("venkat");

System.out.println("the value of s"+s);

System.out.println("the value of s1"+s1);




//lengthof two strings



System.out.println(s.length());
System.out.println(s1.length());

//add two Strings

System.out.println(s.concat(s1));



//uppercase

System.out.println(s.toUpperCase());
System.out.println(s1.toUpperCase());



//equals()

System.out.println(s.equals(s1));
}
}