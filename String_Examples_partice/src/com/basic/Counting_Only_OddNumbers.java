package com.basic;

public class Counting_Only_OddNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		long sum=0l;
		int i=0;
		while(i<=100){
			if(i%2==0){
				
				System.out.println();
				
			}
			else {
				sum+=i;
				
			}
			
			i++;
		}
		System.out.println("The sum of ODD numbers: "+sum);
		System.out.println("The avarge of sum is :"+((double) sum/100));
	}

}
