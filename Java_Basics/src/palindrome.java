import java.util.Scanner;

public class palindrome {
public static void main(String args[])
{
	String original,reverse="";
	Scanner in=new Scanner(System.in);
	System.out.println("enter a string to check if it is palindrome");
	original=in.nextLine();
	int length=original.length();
	for(int i=length-1 ;i>=0 ;i--)
	{
		reverse=reverse+original.charAt(i);
	}
		if(original.equals(reverse))
		{
			System.out.println("entered string is palindrome");
			
		}
		else
		{
			System.out.println("entered string is not a palindrome");
		}
	}
	
		
		
	
	
}

