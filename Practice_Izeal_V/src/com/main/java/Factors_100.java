package com.main.java;

public class Factors_100 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		for(int i=1;i<=100;i++){
			
			System.out.println("printing factors of "+i+" is");
			
			for(int j=1;j<=i;j++){
			
				if(i%j==0){
					
					System.out.println(""+j);
					
				}
			}
			
		}
	}

}
