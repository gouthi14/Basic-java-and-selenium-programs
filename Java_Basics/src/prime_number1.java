
public class prime_number1 {
public static void main(String args[])
{
	int limit=10;
	for(int i=1;i<10;i++)
	{
		boolean isPrime=true;
		for(int j=2;j<i;j++)
		{
			if (i%j==0)
			{
				isPrime=false;
				
				break;
				
			}}
		if(isPrime)
			System.out.println(i);
		
		}
	}
}

