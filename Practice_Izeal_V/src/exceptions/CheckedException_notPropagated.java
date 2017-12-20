package exceptions;

public class CheckedException_notPropagated {
	
	void m(){
		throw new java.io.IOException("Error");
	}
	void n(){
		m();
		
	}
	void p(){
		try{
			n();
		}catch(Exception e){
			System.out.println("Exception Handled");
		}
	}

	public static void main(String[] args) {
		
		CheckedException_notPropagated obj=new CheckedException_notPropagated();
		obj.p();
		

System.out.println("normal.code");
	}

}
