import java.util.Scanner;

public class swap {
public static void main(String args[])
{
	int x,y,temp;
	System.out.println("enter x and y");
	Scanner in=new Scanner(System.in);
	x=in.nextInt();
	y=in.nextInt();
	System.out.println("Before Swaping\nx="+x+"\ny="+y);
	temp=x;
	x=y;
	y=temp;
	System.out.println("After Swaping\nx="+x+"\ny="+y);
	
	
	
	
	
	
}
}
