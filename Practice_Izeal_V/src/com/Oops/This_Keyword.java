package com.Oops;

public class This_Keyword {
	
	int roll;
	String name;
	float fee;
	
	This_Keyword(int roll,String name,float fee){
		roll=roll;
		name=name;
		fee=fee;
	}
	 void display(){
		 System.out.println(roll+" "+name+" "+fee);
	 }
	

	public static void main(String[] args) {
		
		This_Keyword tk=new This_Keyword(1,"goutham",333);
		This_Keyword tk1=new This_Keyword(2,"sathya",222);
		
		tk.display();
		tk1.display();

	}

}
