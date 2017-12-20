package com.Collection;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;



public class Changing_Values {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		   List<String> lo=new LinkedList<>();
		   lo.add("Red");
		   lo.add("White");
		    lo.add("Black");
		     lo.add("Green");
		    // System.out.println(lo);
		     Iterator itr=lo.iterator();
		       while(itr.hasNext())
		       {
		           System.out.println(itr.next());
		       }
		       System.out.println("After Replacing Values.........");
		       lo.set(3, "red");
		       System.out.println(lo);
		   
		}
		}