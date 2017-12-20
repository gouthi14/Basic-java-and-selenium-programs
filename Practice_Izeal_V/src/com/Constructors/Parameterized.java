package com.Constructors;

public class Parameterized {
	
	public Parameterized(){
		System.out.println("defult created");
		
		
	}
	
	public Parameterized(int number,String name){
		System.out.println("number is: "+number);
		
		System.out.println("name is:  "+name);
	}

	public static void main(String[] args) {
		
		Parameterized obj=new Parameterized(1,"goutham");

	}

}
