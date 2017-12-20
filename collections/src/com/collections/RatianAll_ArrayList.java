package com.collections;

import java.util.ArrayList;
import java.util.Iterator;



public class RatianAll_ArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ArrayList<String> al=new ArrayList<String>();
		al.add("goutham");
		al.add("sss");
		al.add("ddd");
		
		ArrayList<String> al2=new ArrayList<String>();
		
		al2.add("vvv");
		al2.add("www");
		al2.add("goutham");
		
		al.retainAll(al2);
		
		Iterator itr=al.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
		
		
	}

}
