package exceptions;

import java.io.IOException;

public class MethodOverloading2_Exception extends MethodOverloading_Exception {
	
	
	
	void m()throws ArithmeticException{
		System.out.println("Exception child");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodOverloading2_Exception obj=new MethodOverloading2_Exception();
		
		obj.m();
	
	}

}

//We can not decalre exception in subclass