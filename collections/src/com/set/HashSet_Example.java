package com.set;

import java.util.HashSet;
import java.util.Iterator;

public class HashSet_Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashSet<String> hs=new HashSet<String>();
		
		hs.add("goutham");
		hs.add("hhh");
		hs.add("rrr");
		hs.add("rrr");
		hs.add("goutham");
		hs.add("rr");
		hs.add("rrr");
		Iterator itr=hs.iterator();
		while(itr.hasNext()){
			
		System.out.println(itr.next());
		
	}
	}
}
