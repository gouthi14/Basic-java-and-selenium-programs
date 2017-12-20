package com.Collection;

import java.util.HashSet;

public class Retaining_Map {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		  HashSet<String> hs1=new HashSet<>();   
		   hs1.add("Red");
		   hs1.add("White");
		   hs1.add("Black");
		   hs1.add("Green");
		   System.out.println("Frist HashSet content: "+hs1);
		   
		   
		  HashSet<String> hs2=new HashSet<>();  
		  hs2.add("Red");
		  hs2.add("Pink");
		  hs2.add("Black");
		  hs2.add("Orange");
		  System.out.println("Second HashSet content: "+hs2);
		  
		 hs1.retainAll(hs2);
		 System.out.println("Frist HashSet content: "+hs1);
		  
		}

		
	}


