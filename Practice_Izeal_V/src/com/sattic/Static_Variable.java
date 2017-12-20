package com.sattic;

public class Static_Variable {
	
	String name;
	int number;
	static String college="mgit";
	
	public Static_Variable(int number1,String name1){
		name=name1;
		number=number1;
		
	}
	
	void display(){
		System.out.println("name is :  "+name);
		
		System.out.println("number is :  "+number);
		
		System.out.println("college is :  "+college);
	}
	
	
	
	

	public static void main(String[] args) {
		
		
		Static_Variable s=new Static_Variable(1,"goutham");
		Static_Variable s2=new Static_Variable(2,"goutham22");
		
		s.display();
		s2.display();
	}

}
