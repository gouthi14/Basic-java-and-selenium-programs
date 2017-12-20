package com.basic;

public class Sum_Avarege_do_while {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		long sum=0l;
		int i=0;
		do {
			sum+=i;
			i++;
			
		}while(i<=100);
		System.out.println("sum of 100 numbers Using Do-while");
		
		System.out.println("the sum is: "+sum);
		System.out.println("the avarge is : " +((double) sum/100));
		
		
		
			
		}
	}


