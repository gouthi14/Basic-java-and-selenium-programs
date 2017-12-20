
public class Method_Overloading {
	void sum(int a,int b)
	{
		System.out.println(a+b);
		
	}
	void sum(int a,int b,int c){
		System.out.println(a+b+c);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Method_Overloading obj=new Method_Overloading();
obj.sum(12, 44);
obj.sum(44, 55, 22);
	}

}
