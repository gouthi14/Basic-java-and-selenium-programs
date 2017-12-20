package exceptions;

public class Exception_Propagation {
	
	
	
	void m(){
		int a=50/0;
		
	}
	
	void n(){
		m();
	}
	void p(){
		try{
			n();
		}
		catch(Exception e){
			System.out.println("Exception Handled");
		}
	}

	public static void main(String[] args) {
		
		Exception_Propagation obj=new Exception_Propagation();
		
		obj.p();
		
		
		System.out.println("normal code");
		
		

	}

}
