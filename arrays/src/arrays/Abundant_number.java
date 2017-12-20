package arrays;

public class Abundant_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		        int Deficient = 0;
		        int Perfect= 0;
		        int Abundant = 0;
		 
		        for (long i = 1; i <= 10_000L; i++) {
		        	 long sum = proper_Divs_Sum(i);  
		            if (sum < i)
		                Deficient++;
		            else if (sum == i)
		                Perfect++;
		            else
		                Abundant++;
		        }
		        System.out.println("Number Counting [(integers) between 1 to 10,000]: ");
		        System.out.println("Deficient number: " + Deficient);
		        System.out.println("Perfect number: " + Perfect);
		        System.out.println("Abundant number: " + Abundant);
		    }
		     public static Long proper_Divs_Sum(long num) {
		        return rangeclosed(1, (num + 1) / 2).filter(i -> num % i == 0 && num != i).sum();
		    }
			
			
	}


