package com.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedList_sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 ArrayList<String> al=new ArrayList<String>();  
		 
		 
		 al.add("zls");
		 al.add("goutham"); 
		 al.add("rjeev");  
		 
		  al.add("john");  
		  al.add("sasi");  
		 
		  
		  Collections.sort(al);
		  Iterator<String> itr=al.iterator();  
		  while(itr.hasNext()){  
		   System.out.println(itr.next());  
		  }  
	}

}
