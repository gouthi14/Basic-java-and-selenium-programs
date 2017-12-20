package Assignment;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your peincipal amount");
		
		Double principalAmount=sc.nextDouble();
		
		
		System.out.println("Enter your the term in years");
		int years=sc.nextInt();
		
		years=years*12;
		
	
		System.out.println("Enter your interest rate");
	 
		Double irate=sc.nextDouble();
		
		irate=irate/100/12;
		
		
		
		//Payment = Principal*monthly interest / 1- (1 / (1+monthly interest)) Power of  Years*12 .
		
		Double payment=principalAmount*irate/1-(1/(1+irate));
		
		payment=(double)Math.round(payment*100)/100;
		
		System.out.println("monthly payment is  "+payment);
		
		
		
	}

}
