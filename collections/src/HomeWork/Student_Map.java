package HomeWork;

import java.util.HashMap;
import java.util.Map;

public class Student_Map extends Student_Homework {

	public Student_Map(int id, String name, int marks) {
		super(id, name, marks);
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<Integer,Student_Homework> map=new HashMap<Integer,Student_Homework>();
		
		Student_Homework s1=new Student_Homework(1,"goutham",99);
		
		Student_Homework s2=new Student_Homework(2,"siddu",98);
		
		Student_Homework s3=new Student_Homework(3,"eshwar",97);
		
		Student_Homework s4=new Student_Homework(4,"surya",96);
		
		Student_Homework s5=new Student_Homework(5,"rajeev",95);
		
		Student_Homework s6=new Student_Homework(6,"shashi",94);
	
		Student_Homework s7=new Student_Homework(7,"anoosha",93);
		
		Student_Homework s8=new Student_Homework(8,"mounika",92);
		
		Student_Homework s9=new Student_Homework(9,"swetha",91);
		
		Student_Homework s10=new Student_Homework(10,"vijaya",90);
		
		map.put(1,s1);
		map.put(2, s2);
		map.put(3, s3);
		map.put(4, s4);
		map.put(5, s5);
		map.put(6,s6);
		map.put(7, s7);
		map.put(8, s8);
		map.put(9, s9);
		map.put(10, s10);
		
		
		  for(Map.Entry<Integer, Student_Homework> entry:map.entrySet()){    
		        int key=entry.getKey();  
		        Student_Homework b=entry.getValue();
		        
		        //System.out.println(b.id+" "+b.name+" "+b.marks);
		        
		        //System.out.println("printing top 5 students");
		        
		       if(key<=5)
		        
		       // System.out.println(key+" Details:");  
		        System.out.println(b.id+" "+b.name+" "+b.marks);   
		
		
		
	}

		  
}
	
}
