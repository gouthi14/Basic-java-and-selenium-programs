package exceptions;

public class Nested_try {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try{
			try{
				System.out.println("now divide");
				int b=30/0;
				
				
			}
			catch(ArithmeticException e){
				System.out.println(e);
			}
			try{
				int a[]=new int[5];
				a[5]=4;
				
			}
			catch(ArrayIndexOutOfBoundsException e){
				System.out.println(e);
				
			}
			System.out.println("executing other statements");
		}
	
		
		catch(Exception e){
			System.out.println(e);
			
		}
		
		System.out.println("normal code executing");
	}

}
