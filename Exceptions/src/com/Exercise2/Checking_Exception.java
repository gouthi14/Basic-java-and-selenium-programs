package com.Exercise2;





/**1) Is the following code legal?

try {
} finally {
}**/

/**Yes, it's legal — and very useful A try statement does not have to have a catch block if it has a finally block.
If the code in the try statement has multiple exit points and no associated catch clauses, 
the code in the finally block is executed no matter how the try block is exited. 
Thus it makes sense to provide a finally block whenever there is code that must always be executed.
This include resource recovery code, such as the code to close I/O streams.**/

//BELOW IS EXAMPLE FOR UNDERSTANDING

public class Checking_Exception {

	
	public static void main(String[] rgs){
		try{  
			   int data=25/0;  
			   System.out.println(data);  
			  }  
			  
			finally {
				
				System.out.println("finally block WITHOUT CATCH");}  
			  
			  }  
			  
	}

