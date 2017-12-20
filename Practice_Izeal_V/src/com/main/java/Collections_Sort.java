package com.main.java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Collections_Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
			  
			ArrayList<Integer> al=new ArrayList<Integer>();  
			al.add(55);
			al.add(45);
			al.add(12);
			al.add(5);
			al.add(99);   
			  
			Collections.sort(al);  
			Iterator itr=al.iterator();  
			while(itr.hasNext()){  
			System.out.println(itr.next());  
			 }  
			}  
			}
