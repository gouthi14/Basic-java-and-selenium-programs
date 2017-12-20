
public class MultipleCatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		try
		{
			int a[]=new int[4];
			a[4]=20/0;
		}
		catch(ArithmeticException e)
		{
			System.out.println("logic error");
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
		System.out.println("array excep");
		
		}
	}

}
