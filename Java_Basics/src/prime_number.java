
public class prime_number {
public static void main(String args[])
{
	int i=0;
	int num=0;
	String prime_number="";
	for(i=0;i<=10;i++)
	{
		int counter=0;
		for(num=1;num>=0;num--)
		{
			if(i%num==0)
			{
				counter=counter+1;
				
			}
		}
		if(counter==2)
		{
			prime_number=prime_number+i+"";
			
		}
	}
	System.out.println("prime numbers from 1 to 10");
	System.out.println(prime_number);
	
}
}
