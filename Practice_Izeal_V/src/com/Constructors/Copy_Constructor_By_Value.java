package com.Constructors;

public class Copy_Constructor_By_Value {
	
	
	int number;
	String name;
	
	public Copy_Constructor_By_Value(int n,String na){
		number=n;
		name=na;
		
	}

	public Copy_Constructor_By_Value(Copy_Constructor_By_Value c){
		number=c.number;
		name=c.name;
	}
	
	void display()
	{
		System.out.println("number is :"+number);
		System.out.println("name is :" +name);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Copy_Constructor_By_Value cs=new Copy_Constructor_By_Value(1,"goutham");
		
		Copy_Constructor_By_Value cs2=new Copy_Constructor_By_Value(cs);
		cs.display();
		
		cs2.display();
	}

}
