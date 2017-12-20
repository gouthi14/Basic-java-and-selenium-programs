package arrays;

import java.util.Arrays;

public class Scend_smallest_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] array = { 22,34,65,78,12,33 };

	    int firstSmallest = Integer.MAX_VALUE;
	    int secondSmallest = Integer.MAX_VALUE;
	    int i = 0;
	    System.out.println(Arrays.toString(array));

	    
	        for (i = 0; i < array.length; i++) {

	            if (array[i] < firstSmallest) {
	                secondSmallest = firstSmallest;
	                firstSmallest = array[i];
	            } else if (array[i] < secondSmallest && array[i] > firstSmallest) {
	                secondSmallest = array[i];
	            }
	        }    

	       
	        System.out.println("secondSmallest number is " + secondSmallest);

	    }
	}