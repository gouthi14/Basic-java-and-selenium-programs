package com.Exercise2;

public class C extends B{
	 void msg()throws Exception{System.out.println("Class C Exception");} 
	  
     public static void main(String args[]){  
  A a=new A();  
  try{  
  a.msg();
  System.out.println("executing c class");
  }catch(Exception e){}  
 }  
} 