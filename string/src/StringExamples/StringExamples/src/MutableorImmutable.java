/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Java
 */
public class MutableorImmutable {
    
public static void main(String args[])
{
//StringBuffer s1=new StringBuffer("priya");
//StringBuffer s2=new StringBuffer("Jacob");
    String s1="Hello";
String s2="Gautham";
    
    System.out.println("the hashcode of s1"+s1.hashCode());
System.out.println("the hashcode of s2"+s2.hashCode());

 s1=s1.concat(s2);
System.out.println("the hashcode of s1"+s1.hashCode());
//System.out.println("the hashcode of s1"+s1.hashCode());

    
//

System.out.println(s1);
//System.out.println(s1+s2);
//System.out.println(s2);
//System.out.println(s2);

}}

