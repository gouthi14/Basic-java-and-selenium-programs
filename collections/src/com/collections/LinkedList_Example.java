package com.collections;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedList_Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList<String> li=new LinkedList<String>();
		li.add("goutham");
		li.add("html");
		li.add("goutham");
		li.add("html");
		
		Iterator itr=li.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
	}

}
