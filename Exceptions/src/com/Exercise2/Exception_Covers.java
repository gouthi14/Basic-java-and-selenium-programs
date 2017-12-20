package com.Exercise2;


/**2)What exception types can be caught by the following handler?
catch (Exception e) {
}**/



/** This handler catches exceptions of type Exception; therefore, it catches any exception. 
 * This can be a poor implementation because you are losing
 *  valuable information about the type of exception being thrown and making your code less efficient.
 * 
 *
 */

public class Exception_Covers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 try{  
		     // int data=50/0;
			 
			 
		      String s=null;  
		      System.out.println(s.length());
		      
		      String g="abc";  
		      int i=Integer.parseInt(g);
		      
		      int a[]=new int[5];  
		      a[10]=50;
		   }catch(ArithmeticException e){System.out.println(e);}  
		   
		}  
		 
		
	}


