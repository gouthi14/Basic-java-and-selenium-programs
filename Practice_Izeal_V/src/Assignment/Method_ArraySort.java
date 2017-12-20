package Assignment;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Method_ArraySort {
	
	public static void array(int array[]){
		
		for(int i=0;i<array.length;i++){
			System.out.println(array[i]);
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[]={1,7,9,8,3,2};
		Arrays.sort(arr);
		
		Method_ArraySort.array(arr);
		
	}

}
