package com.Map;

import java.util.HashMap;

public class HashMap_remove {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<Integer,String> hm=new HashMap<Integer,String>();
		
		hm.put(1, "goutham");
		hm.put(2, "thuluva");
		hm.put(3, "nnnn");
		hm.put(4, "ddd");
		System.out.println("full elements: "+hm);
		hm.remove(2);
		System.out.println("after removing elements: "+hm);
		
		
	}

}
