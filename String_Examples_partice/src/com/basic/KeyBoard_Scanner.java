package com.basic;

import java.util.Scanner;

public class KeyBoard_Scanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int i;
		double b;
		String s;
		Scanner scan=new Scanner(System.in);
		System.out.println("enter ineger");
		i=scan.nextInt();
		
		System.out.println("enter Double");
		b=scan.nextDouble();
		
		System.out.println("enter String");
		s=scan.next();
		double sum=i+b;
		
		System.out.println("hi   "+s+"  the sum of  "+i+"  and  "+b+"the sum is  " +sum);
	}

}
