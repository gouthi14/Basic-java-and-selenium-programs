package com.basic;

import java.util.Scanner;


public class Perfect_Number {

	

		
		public int num=0;
	    public void getnum()  
	    {
	        Scanner in=new Scanner(System.in); 
	        System.out.println("Enter a number");
	        num=in.nextInt();
	    }
	    public void fnchecknumber() 
	    {
	        int sum=0,dnum=0,anum=0;
	        for(int i=1;i<=num;i++)  
	        {
	            if(num%i==0)
	              sum+=i;
	        }
	        dnum=2*num;
	        if(sum<dnum)
	          System.out.println("It is a Deficient number");
	        else if(sum==dnum)  
	          System.out.println("It is a Perfect number");
	        else if(sum>dnum)
	          System.out.println("It is an Abundant number");
	       
	        
	    }
	    
	    public static void main(String[] args)  
	    {
	    	Perfect_Number ob=new Perfect_Number();  
	     ob.getnum();                      
	        ob.fnchecknumber();         
	    }
	




	}


