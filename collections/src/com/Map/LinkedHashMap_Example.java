package com.Map;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMap_Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedHashMap<Integer,String> lhm=new LinkedHashMap<Integer,String>();
		
		lhm.put(1, "goutham");
		lhm.put(2, "thuluva");
		lhm.put(3, "goud");
		lhm.put(4,"mahesh");
		for(Map.Entry m:lhm.entrySet()){
			System.out.println(m.getKey()+" "+m.getValue());
		}
		
	}

}
