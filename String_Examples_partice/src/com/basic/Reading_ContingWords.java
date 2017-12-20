package com.basic;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Reading_ContingWords {

	public static void main(String[] args) throws FileNotFoundException  {
		// TODO Auto-generated method stub

		HashMap<String,Integer>  hmap=new HashMap<String,Integer>();
		
		Scanner ch=new Scanner(new File("C:\\Users\\gouthamgoud\\Desktop\\testing.txt"));
		while(ch.hasNext()){
			String word=ch.next();
			if(hmap.containsKey(word)){
			
				
				int count=hmap.get(word)+1;
				
				hmap.put(word,count);
				
				
				
			}
			
			else{
				hmap.put(word, 1);
			}
		}
		ch.close();
		
		for(Map.Entry m:hmap.entrySet()){
			System.out.println(m);
			
		}
			
				
	}

}
