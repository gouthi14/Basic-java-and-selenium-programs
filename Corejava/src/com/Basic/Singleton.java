package com.Basic;

public class Singleton {
	
	private static Singleton myObj;
	
	static{
		myObj=new Singleton();
	}
	
	private Singleton(){
		
	}
	
	public static Singleton getInstance(){
		return myObj;
		
	}
	
	public void test(){
		System.out.println("its working");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Singleton st=getInstance();
		
		st.test();
	}

}
