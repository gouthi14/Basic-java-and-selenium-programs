package exceptions;

public class Multiple_catch_a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		try{
			int a[]=new int[5];
			
			a=30/0;
			
		}
		catch(ArithmeticException e){
			 
			System.out.println("step1");
			
		}
		
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("step2");
		}
		
		catch(Exception e){
			System.out.println("common for all");
		}
		
		
		
		System.out.println("rest of the code executing");
		
	}


	}


