package com.basic;


import java.util.Scanner;

public class Reverse_String {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub

		String reverse="";
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the String");
		
		String s=scan.nextLine();
		 int length = s.length();
		System.out.println("given String is: "+s);
		
		 for ( int i = length - 1 ; i >= 0 ; i-- )
		     reverse = reverse + s.charAt(i);
		 
		 System.out.println("Reverse of entered string is: "+reverse);
		
		
		
		
		
	}

}
