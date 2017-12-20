package com.Constructors;

public class Constructor_Overloading {
	
	int number;
	String name;
	double salary;
	
	public Constructor_Overloading(){
		System.out.println("Defult created");
		
	}
	
	public Constructor_Overloading(int number,String name){
		super();
		this.number=number;
		this.name=name;
		
	}
	
	public Constructor_Overloading(int number,String name,double salary){
		super();
		this.name=name;
		this.number=number;
		this.salary=salary;
	}
	
	void display(){
		System.out.println("Number is :  "+number);
		
		System.out.println("Name is :  "+name);
		
		System.out.println("salary is :  "+salary);
	}
	

	public static void main(String[] args) {
		
		Constructor_Overloading c=new Constructor_Overloading(1,"goutham");
		
		Constructor_Overloading c2=new Constructor_Overloading(1,"surya",222.33);
		
		Constructor_Overloading c3=new Constructor_Overloading();
		
		c.display();
		c2.display();
 
	}

}
