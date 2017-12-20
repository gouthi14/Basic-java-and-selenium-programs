import java.util.Scanner;

public class swap1 {
public static void main(String args[])
{
	int a,b;
	System.out.println("enter a and b");
	Scanner in=new Scanner(System.in);
	a=in.nextInt();
	b=in.nextInt();
	System.out.println("Before Swaping\na="+a+"\nb="+b);
	a=a+b;
	b=a-b;
	a=a-b;
	System.out.println("After Swaping\na="+a+"\nb="+b);
	
}
}