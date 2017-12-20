package exceptions;

public class FinallyBlock2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try{
			int a=30/0;
			System.out.println(a);
			
		}
		catch(NullPointerException e){
			System.out.println(e);
		}
		
		finally{
		System.out.println("finally executing");	
		}
		
		
		
		System.out.println("normal code");
		
	
	}

}
