package exceptions;

import java.io.IOException;

 class Throws2 {
	
	
	void m()throws IOException{
 
		throw new IOException("error");
		
	}
}
	
	public class Throws3{

	public static void main(String[] args) {
		
	try{
		Throws2 th=new Throws2();
		 th.m();
		 
	}
	catch(Exception e){
		System.out.println(e);
	}
	
	System.out.println("normal code");

	}

}
