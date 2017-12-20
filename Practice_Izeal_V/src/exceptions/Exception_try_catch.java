package exceptions;

public class Exception_try_catch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try{
			int data=50/0;
			
		}catch(ArithmeticException e){
			
			System.out.println(e);
		}
		
		System.out.println("Executing rest of the code");
	}

}
