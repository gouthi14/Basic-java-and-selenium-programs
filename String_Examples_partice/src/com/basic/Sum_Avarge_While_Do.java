package com.basic;

public class Sum_Avarge_While_Do {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		long sum=0l;
		int i=0;
		
		while(i<=100){
			sum+=i;
			i++;
		}
			System.out.println("conting 1 to 100 Using while-Do");
			 System.out.println("The sum is: "+sum);
			 System.out.println("The avarge is : "+((double) sum/100 ));
			
		
	}

}
