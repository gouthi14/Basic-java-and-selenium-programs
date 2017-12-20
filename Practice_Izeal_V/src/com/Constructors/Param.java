package com.Constructors;

public class Param {
	
	int number;
	String name;
	public Param(){
		
		System.out.println("defult cons created");
		
	}
public Param(int number,String name){
	super();
	this.name=name;
	this.number=number;
	
}

void display(){
	System.out.println("number is:  "+number);
	System.out.println("name is:  "+name);
}
	public static void main(String[] args) {
		
		
		Param p=new Param(1,"goutham");
		Param p1=new Param(2,"surya");
		
		Param p3=new Param();
		
		p.display();
		p1.display();

	}

}
