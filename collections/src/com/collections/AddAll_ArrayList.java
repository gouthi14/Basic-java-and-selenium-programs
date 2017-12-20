package com.collections;

import java.util.ArrayList;
import java.util.Iterator;

public class AddAll_ArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> al=new ArrayList<String>();
		al.add("goutham");
		al.add("surya");
		al.add("ddd");
		
		ArrayList<String> al2=new ArrayList<String>();
		al2.add("ccc");
		al2.add("sss");
		al2.add("eee");
		
		al.addAll(al2);
		
		//System.out.println("All Arraylist Elements: "+al);
		
		Iterator itr=al.iterator();
		while(itr.hasNext())
		
		{
		System.out.println(itr.next());	
		}
		
		
	}

}
