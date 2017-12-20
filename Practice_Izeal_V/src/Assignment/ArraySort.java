package Assignment;

public class ArraySort {

	
	
	    void passArr()
	    {
	        int arr1[]={1,9,5,4,2,6,7,8,3};
	        printArr(arr1);
	    }

	    void printArr(int[] arr2)
	    {
	        for(int i=0;i<arr2.length;i++)
	        {
	            System.out.println(arr2[i]+"  ");
	        }
	    }

	    public static void main(String[] args)
	    {
	    	ArraySort ob=new ArraySort();
	        ob.passArr();
	        
	    }
	}