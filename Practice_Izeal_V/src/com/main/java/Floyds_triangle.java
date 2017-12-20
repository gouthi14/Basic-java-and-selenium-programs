package com.main.java;

import java.util.Scanner;

public class Floyds_triangle {

	public static void main(String[] args) {
		int n,c,d,num=1;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number of rows");
		n=sc.nextInt();
		System.out.println("Printing floyds tringle");

		
		for(c=0;c<=n;c++){
			
			for(d=1;d<=c;d++){
				System.out.print(num+" ");
				num++;
			}
			
			System.out.println(" ");
		}

	}

}
