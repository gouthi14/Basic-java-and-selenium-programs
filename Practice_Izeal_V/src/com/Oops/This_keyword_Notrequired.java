package com.Oops;

public class This_keyword_Notrequired {
 
		int rollno;  
		String name;  
		float fee;  
		This_keyword_Notrequired(int r,String n,float f){  
		rollno=r;  
		name=n;  
		fee=f;  
		}  
		void display(){System.out.println(rollno+" "+name+" "+fee);}  
		}  
		  
		class TestThis3{ 
			
		public static void main(String args[]){ 
			
	
		This_keyword_Notrequired s1=new This_keyword_Notrequired(111,"at",5000f);  
		This_keyword_Notrequired s2=new This_keyword_Notrequired(112,"st",6000f);  
		//s1.display();  
		//s2.display();
	s1.display();
	s2.display();
		}
		
		}
		
		
		
		
		
		
		
		