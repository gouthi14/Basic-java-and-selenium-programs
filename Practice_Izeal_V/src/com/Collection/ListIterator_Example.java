package com.Collection;

import java.util.ArrayList;
import java.util.ListIterator;

public class ListIterator_Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ArrayList<String> al=new ArrayList<String>();
		al.add("array");
		al.add("ssssss");
		al.add("www");
		al.add("wwwqqq");
		al.add("xxx");
		al.add("qqq");
		al.add("lll");
		
		ListIterator<String> lit=al.listIterator();
		System.out.println("Retriving forward direction");
		while(lit.hasNext()){
			System.out.println(lit.next());
		}
		
		System.out.println("Retriving backword direction");
		while(lit.hasPrevious())
		{
			System.out.println(lit.previous());
		}
		
	}

}
