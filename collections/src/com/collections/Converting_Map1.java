package com.collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Converting_Map1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	 HashSet<String> hs=new HashSet<String>(); 
	   hs.add("Red");
	   hs.add("White");
	   hs.add("Pink");
	   hs.add("Yellow");
	   hs.add("Black");
	   hs.add("Green");
	   System.out.println("Original Hash Set: "+hs);
	   
	   
	  List<String> al=new ArrayList<>(hs);
	   
	  
	   
	   System.out.println("ArrayList contains: "+al);
	      
	
	}
	}
