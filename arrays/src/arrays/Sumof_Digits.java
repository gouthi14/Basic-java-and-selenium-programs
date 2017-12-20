package arrays;

public class Sumof_Digits {


		    int sum = 0;
		     
		    public int getNumberSum(int number){
		         
		        if(number == 0){
		            return sum;
		        } else {
		            sum += (number%10);
		            getNumberSum(number/10);
		        }
		        return sum;
		    }
		     
		    public static void main(String a[]){
		    	 Sumof_Digits mns = new  Sumof_Digits();
		        System.out.println("Sum is: "+mns.getNumberSum(995));
		    }

		
	}


