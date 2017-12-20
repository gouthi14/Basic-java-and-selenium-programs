package com.collections;

import java.util.HashMap;
import java.util.Iterator;

public class Map extends Object {

	public static void main(String[] args) {
		
   Object obj=new Object();
 
		HashMap<Object,String> hm=new HashMap<Object,String>();
		
		hm.put(obj, "Java");
		hm.put(obj, "hhu");
		//hm.put("shs", "gdgd");
		
		Iterator<Object> itr=hm.keySet().iterator();
		
		itr.next();
		

		
	}

}
