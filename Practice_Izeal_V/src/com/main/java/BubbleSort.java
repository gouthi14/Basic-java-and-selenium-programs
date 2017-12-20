package com.main.java;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int array[]={4,9,8,1,6,10};
		
		System.out.println("printing before sorting");
		for(int i:array){
			System.out.println(i);
		}
			bubblesort(array);
			
			System.out.println("printing After sorting");
			for(int i:array){
				System.out.println(i);
			
		}
		
	}

	private static void bubblesort(int[] array) {
		int temp=0;
		
		for(int i=0;i<array.length;i++){
			
			for(int j=1;j<(array.length)-1;j++){
				
				if(array[j-1]>array[j]){
					
					temp=array[j-1];
					array[j-1]=array[j];
					array[j]=temp;
					
					
				}
				
			}
		}
		
	}
	
	

}
