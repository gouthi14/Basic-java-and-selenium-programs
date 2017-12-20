package com.Collection;

import java.util.ArrayList;
import java.util.Iterator;

public class RemoveAll_ArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> al=new ArrayList<String>();
		al.add("aaa");
		al.add("bbb");
		al.add("ccc");
		
		ArrayList<String> al2=new ArrayList<String>();
		al2.add("ddd");
		al2.add("bbb");
		al2.add("eee");
		al.removeAll(al2);
		
		Iterator itr=al.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
		
		
		
		
	}

}
