
public class arthamatic_method {

int a=2;
	int b=4;
	
 void add()
	
	{
		System.out.println(a+b);
		
	}
	public void sub()
	{
		System.out.println(a-b);
	}
	public void mul()
	{
		System.out.println(a*b);
		
	}
	public void div()
	{
	System.out.println(a/b);
	}
	public static void main(String args[])
	{
		arthamatic_method obj=new arthamatic_method();
		
		obj.mul();
		obj.add();
		obj.sub();
		obj.div();
	}
}

