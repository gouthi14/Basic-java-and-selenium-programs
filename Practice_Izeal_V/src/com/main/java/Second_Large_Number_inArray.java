package com.main.java;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Second_Large_Number_inArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int array[]={20,38,12,14,15,44,33,25};
		
		Arrays.sort(array);
		System.out.println("first large number="+array[array.length-1]);
		System.out.println("second large number="+array[array.length-2]);
	}

}
