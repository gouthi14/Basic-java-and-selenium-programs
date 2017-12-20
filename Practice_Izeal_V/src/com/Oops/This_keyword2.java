package com.Oops;

public class This_keyword2 {

	int roll;
	String name;
	float fee;
	
	 This_keyword2(int roll,String name,float fee){
		this.roll=roll;
		this.name=name;
		this.fee=fee;
	}
	 void display(){
		 System.out.println(roll+" "+name+" "+fee);
	 }
	

	public static void main(String[] args) {
		
		This_keyword2 tk=new This_keyword2(1,"goutham",333);
		This_keyword2 tk1=new This_keyword2(2,"sathya",222);
		
		tk.display();
		tk1.display();

	}

}
