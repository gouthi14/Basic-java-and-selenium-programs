package com.Collection;

import java.util.ArrayList;
import java.util.Iterator;

public class Constructor_ArrayList {

	public static void main(String[] args) {
		
		Student s1=new Student(1,"goutham","VIU");
		Student s2=new Student(2,"bbb","mgit");
		Student s3=new Student(3,"vvv","sana");

		ArrayList<Student> al=new ArrayList<Student>();
		al.add(s1);
		al.add(s2);
		al.add(s3);
		
		Iterator it=al.iterator();
		while(it.hasNext()){
			Student st=(Student)it.next();
			System.out.println(st.rollno+" "+st.name+" "+st.college);
		}
		
		
		
		
	}

}
