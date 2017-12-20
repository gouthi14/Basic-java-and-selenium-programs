package com.Exercise2;

public class Exception_Using_Extends2 {
	
		 public static void f() throws Exception_Using_Extends {
		  System.out.println("Throwing MyException from f()");
		  throw new Exception_Using_Extends("From f()");
		 }
		 public static void main(String[] args) {
		  try {
		   f();
		  } catch(Exception_Using_Extends e) {
		   System.err.println("Caught Exception_Using_Extends");
		   e.printStackTrace();
		  } finally {
		   System.out.println("Executing finally");
		  }
		  
		 } 
		}

