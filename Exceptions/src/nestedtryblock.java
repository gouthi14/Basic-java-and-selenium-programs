
public class nestedtryblock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
			try
			{
				System.out.println("Doing dividion ");
				int a=20/0;
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
			try
			{
				int  b[]=new int[5];
				b[5]=4;
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
			finally
			{
				System.out.println("final block executed");
			}
		
		System.out.println("general excution");
	}

}
