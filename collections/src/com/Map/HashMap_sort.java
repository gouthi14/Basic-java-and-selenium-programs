package com.Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class HashMap_sort {

	public static void main(String[] args) {
	
		HashMap<Integer,String> hm=new HashMap<Integer,String>();
		
		hm.put(6, "goutham");
		hm.put(2, "anoosha");
		hm.put(5, "sidhu");
		hm.put(1, "vijaya");
		
		System.out.println("before sorting");
		
		Set set=hm.entrySet();
		
		Iterator ite=set.iterator();
		while(ite.hasNext()){
			Map.Entry me=(Map.Entry)ite.next();
			
			System.out.print(me.getKey()+":");
			System.out.println(me.getValue());
			
		}
		
		
		Map<Integer,String> map=new TreeMap<Integer,String>(hm);
		
		System.out.println("After sorting");  
		
		Set set2=map.entrySet();
		Iterator it=set2.iterator();
		while(it.hasNext()){
		Map.Entry m=(Map.Entry)it.next();
		
		System.out.print(m.getKey()+":");
		
		System.out.println(m.getValue());
		}
		
		
		
		

	}

}
