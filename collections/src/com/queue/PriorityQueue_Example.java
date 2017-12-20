package com.queue;

import java.util.Iterator;
import java.util.PriorityQueue;

public class PriorityQueue_Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PriorityQueue<String> pq=new PriorityQueue<String>();
		pq.add("goutham");
		pq.add("ddd");
		pq.add("gooutham");
		pq.add("jjj");
		System.out.println(pq.element());
		System.out.println(pq.poll());
		System.out.println(pq.peek());
		System.out.println(pq.contains(null));
		System.out.println(pq.size());
		System.out.println(pq.isEmpty());
		Iterator<String> itr=pq.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
	}

}
