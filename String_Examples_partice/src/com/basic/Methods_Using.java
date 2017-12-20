package com.basic;

public class Methods_Using {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String s="goutham";
		String d="goud";
		String a="GOUTHAM";
		
		//Concating two strings
		
		String q=s.concat(d);
		
		System.out.println(q);
		
		System.out.println("length of the s  "+s.length());
		
		System.out.println("Length of the d  "+d.length());
		System.out.println("Ends with of s  "+s.endsWith("m"));
		System.out.println("Ends with of d  "+d.endsWith("d"));
		
		System.out.println("Replacing char u with w   "+s.replace("u", "w"));
		
		System.out.println("SubString of s  "+s.substring(3, 6));
		
		System.out.println("trim the s  "+s.trim());
		
		System.out.println("finding charAt in s  "+s.charAt(4));
		System.out.println("Comparing s and a using CompareToIgnoreCase  "+s.compareToIgnoreCase(a));
		
		System.out.println("coverting to Uppercase   "+s.toUpperCase());
		System.out.println("converting to Lowercase   "+a.toLowerCase());
		
		
	}

}
