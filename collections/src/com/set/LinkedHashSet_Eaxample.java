package com.set;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSet_Eaxample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedHashSet<String> lis=new LinkedHashSet<String>();
		lis.add("goutham");
		lis.add("ttt");
		lis.add("kkk");
		lis.add("goutham");
		
		Iterator itr=lis.iterator();
		
		while(itr.hasNext()){
			System.out.println(itr.next());
			
		}
		
				
	}

}
