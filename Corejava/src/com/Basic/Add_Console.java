package com.Basic;

import java.util.Scanner;

public class Add_Console {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
	
		System.out.println("enter first number");
		String a=sc.nextLine();
		
		System.out.println("enter Scend number");
		String b=sc.nextLine();
		
		int a1=Integer.parseInt(a);
		int b1=Integer.parseInt(b);
		
		
		int c=a1+b1;
		System.out.println("Addition  "+c);
	}

}
