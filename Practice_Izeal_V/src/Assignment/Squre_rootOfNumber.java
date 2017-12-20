package Assignment;

import java.util.Scanner;

public class Squre_rootOfNumber {
	
	public static int sq(int number){
		
		number=number*number;
		return number;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter your number for suareRoot");
		
		  int number=sc.nextInt();

		  System.out.println("the squre for number is   "+sq(number));
			
		  
	}

}
