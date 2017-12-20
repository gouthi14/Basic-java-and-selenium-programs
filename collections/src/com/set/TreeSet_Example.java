package com.set;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSet_Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeSet<String> ts=new TreeSet<String>();
		ts.add("gouthasm");
		ts.add("ththt00");
		ts.add("aaa");
		Iterator itr=ts.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
		
		
	}

}
