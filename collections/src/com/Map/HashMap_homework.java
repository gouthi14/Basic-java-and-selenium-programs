package com.Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class HashMap_homework {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int sum = 0;
int sum1=0;
int ramya=0;
int mounika=0;
int raje=0;
int anoosha=0;
int siddu=0;
int swetha=0;
HashMap<String,Integer> hm=new HashMap<String,Integer>();
		hm.put("English", 89);
		hm.put("maths", 56);
		hm.put("social", 78);
		hm.put("computer", 57);
				
		for (Entry<String, Integer> entry : hm.entrySet()) {
		    sum += entry.getValue();
		    
		   
		}
		
		 System.out.println("total marks of goutham: "+sum);
		 if(sum/4>70)
		 System.out.println("average marks of goutham is greater than 70%");
		
		 
		 
		 HashMap<String,Integer> raj=new HashMap<String,Integer>();	 
		 
		 
		 raj.put("English", 77);
			raj.put("maths", 88);
			raj.put("social", 89);
			raj.put("computer", 99);
			
			
			for (Entry<String, Integer> entry : raj.entrySet()) {
			     sum1 += entry.getValue();
			    
			   
			}
			
			 System.out.println("total marks of surya: "+sum1);
			 if(sum1/4>70)
			 System.out.println("average marks of surya is greater than 70%");
			 
			 
			 HashMap<String,Integer> ra=new HashMap<String,Integer>();	 
			 
			 
			 ra.put("English", 66);
				ra.put("maths", 56);
				ra.put("social", 49);
				ra.put("computer", 89);
				
				
				for (Entry<String, Integer> entry : ra.entrySet()) {
				     ramya += entry.getValue();
				    
				   
				}
				
				 System.out.println("total marks of ramya: "+ramya);
				 if(ramya/4>70)
				 System.out.println("average marks of ramya is greater than 70%");
				 
				 
				 
				 
				 
				 
				 HashMap<String,Integer> mo=new HashMap<String,Integer>();	 
				 
				 
				 mo.put("English", 78);
					mo.put("maths", 38);
					mo.put("social", 69);
					mo.put("computer", 79);
					
					
					for (Entry<String, Integer> entry : mo.entrySet()) {
					     mounika += entry.getValue();
					    
					   
					}
					
					 System.out.println("total marks of mounika: "+mounika);
					 if(mounika/4>70)
					 System.out.println("average marks of mounika is greater than 70%");
					 
					 
					 
					 
					 HashMap<String,Integer> bh=new HashMap<String,Integer>();	 
					 
					 
					 bh.put("English", 55);
						bh.put("maths", 76);
						bh.put("social", 90);
						bh.put("computer", 49);
						
						
						for (Entry<String, Integer> entry : bh.entrySet()) {
						     raje += entry.getValue();
						    
						   
						}
						
						 System.out.println("total marks of rajeev: "+raje);
						 if(raje/4>70)
						 System.out.println("average marks of rajeev is greater than 70% ");
						 
						 
						 
						 
						 HashMap<String,Integer> ano=new HashMap<String,Integer>();	 
						 
						 
						 ano.put("English", 44);
							ano.put("maths", 38);
							ano.put("social", 49);
							ano.put("computer", 69);
							
							
							for (Entry<String, Integer> entry : ano.entrySet()) {
							     anoosha += entry.getValue();
							    
							   
							}
							
							 System.out.println("total marks of anoosh: "+anoosha);
							 if(anoosha/4>70)
							 System.out.println("average marks of anoosha is greater than 70%");
							 
							 
							 HashMap<String,Integer> sid=new HashMap<String,Integer>();	 
							 
							 
							 sid.put("English", 99);
								sid.put("maths", 98);
								sid.put("social", 99);
								sid.put("computer", 79);
								
								
								for (Entry<String, Integer> entry : sid.entrySet()) {
								     siddu += entry.getValue();
								    
								   
								}
								
								 System.out.println("total marks of siddu: "+siddu);
								 if(siddu/4>70)
								 System.out.println("average marks of siddu greater then 70%");
								 
								 
								 HashMap<String,Integer> sw=new HashMap<String,Integer>();	 
								 
								 
								 sw.put("English", 33);
									sw.put("maths", 28);
									sw.put("social", 19);
									sw.put("computer", 59);
									
									
									for (Entry<String, Integer> entry : sw.entrySet()) {
									     swetha += entry.getValue();
									    
									   
									}
									
									 System.out.println("total marks of swetha: "+swetha);
									 if(swetha/4==70)
									 System.out.println("avarge marks of swetha is greater than 70%: ");
									 
									 
									 
									 
		
	}

	
	
}

	


