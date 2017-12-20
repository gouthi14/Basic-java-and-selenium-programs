package arrays;

public class Odd_numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Prrinting odd numbers");
		for(int i=0;i<=100;i++)
		{
			 if(i% 2!= 0){
				 System.out.println(i);
				 
				 for(int j=1;j<=i;j++){
					 System.out.print("*");
					 
				 }
				 
				 System.out.println(" ");
			 }
		}
	}

}
