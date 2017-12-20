package com.Map;

import java.util.HashMap;
import java.util.Map;

public class HashMap_Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<Integer,String> hm=new HashMap<Integer,String>();
		
		hm.put(1, "goutham");
		hm.put(2, "www");
		hm.put(4, "shan");
		hm.put(7, "rsafa");
		
		System.out.println(hm.isEmpty());
		System.out.println(hm.entrySet());

		for(Map.Entry m:hm.entrySet()){
			System.out.println(m.getKey()+" "+m.getValue());
		}
		
		
		
	}

}
