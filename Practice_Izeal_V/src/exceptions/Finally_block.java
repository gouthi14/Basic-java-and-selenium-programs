package exceptions;

public class Finally_block {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try{
			int a=25/5;
			System.out.println(a);
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
			
		}
		finally{
			System.out.println("finally block code executes always");
		}
		System.out.println("rest of the code executes");
	}

}
