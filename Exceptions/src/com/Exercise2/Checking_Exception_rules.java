package com.Exercise2;

/**  Is there anything wrong with the following exception handler as written? Will this code compile?
try {
} catch (Exception e) {
} catch (ArithmeticException a) {
}**/




/**This first handler catches exceptions of type Exception; therefore, it catches any exception, including ArithmeticException. 
 * The second handler could never be reached. This code will not compile.**/
 
 

public class Checking_Exception_rules {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			int data=50/0;

		} catch (Exception e) {
			
			System.out.println(e);
		   
		} catch (ArithmeticException a) {
		    
		}
	}

}
