package HomeWork;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Student_Marks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int i;
HashMap<String,Integer> hm=new HashMap<String,Integer>();
		
		hm.put("goutham", 999);
		//hm.put("mounika",998);
		hm.put("anoosha",997);
		hm.put("swapna",996);
		hm.put("surya",995);
		hm.put("swetha",994);
		hm.put("rajeev", 993);
		hm.put("shiva", 992);
		hm.put("siddu", 990);
		hm.put("ramya",991);
		hm.put("vijaya", 989);
		
		
		System.out.println("Student details(name and marks)");
		//System.out.println(hm.entrySet());

		for(Map.Entry m:hm.entrySet()){
			System.out.println(m.getKey()+" "+m.getValue());
		
		
		
		System.out.println("printing the top 5 students");

			
			int e=(int) m.getKey();
			
			if (e<=995){
				
				
				System.out.println("Top 5 Students:   "+e+"name is:  "+m.getValue());
			}
			else{
				
			System.out.println("Mahatma Gandhi institute of technology");
			
		
				
			}
		}
		
		
}}
