package com.basic;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class File_Scanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	try {
		Scanner scan=new Scanner(new File("C:\\Users\\gouthamgoud\\Desktop\\goutham.txt"));
		
		int i=scan.nextInt();
		System.out.println("integer is : "+i);
		
		double b=scan.nextDouble();
		
		System.out.println("double value is : "+b);
		
		String s=scan.next();
		System.out.println("the String is: "+s);
		
		double sum=i+b;
		
		System.out.println("hii  "+s+"the sum of"+i+"and  "+b+"The sum is "+sum);
		
	
	} catch (FileNotFoundException e) {
		
		e.printStackTrace();
	}
	
	
	
	
		
	}

}
