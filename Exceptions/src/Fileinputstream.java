import java.io.FileInputStream;

public class Fileinputstream {

	public static void main(String args[])
	{
		char ch;
		
		try
		{
			//DataInputStream dis=new DataInputStream(system.in);
			FileInputStream g=new FileInputStream("myfile.txt");
	g.read();
			System.out.println("file reading sucess");
					
		
		}
			catch(Exception g)
			{
				System.out.println("exception g");
			}
			
			finally
			{
				System.out.println("no data to read");
				
			}
			
			
			
		
	}
}
