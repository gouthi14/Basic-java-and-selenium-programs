package Assignment;

import java.util.Scanner;

public class SquareRoot {
	
	
	public static void main(String[] args){
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter an integer");
		int n=s.nextInt();
		//System.out.println("Enter an integer");
		
		
		System.out.println("The squareroot of a num is "+sqrt(n));
		
	}

	public static int sqrt(int n) {
       
           int m;
           int sqr = n/2;
           {
        	   m = sqr;
        	   sqr = (m+(n/m))/2;
           }
		while((m- sqr)!=0);
           
		return sqr;
	}
}