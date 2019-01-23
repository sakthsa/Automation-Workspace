package com.ss.Collection;

import java.util.Iterator;
import java.util.PriorityQueue;

public class PriorityyQueue {

	public static void main(String[] args) {
		PriorityQueue<String> pq = new PriorityQueue<>();
		pq.add("One");
		pq.offer("Two");
		Iterator<String> itr = pq.iterator();
		System.out.println(pq.getClass());
		String str = pq.getClass().toString();
		System.out.println(str);
		String[] str2 = str.split(".",0);
		System.out.println(str2.length);

	}

}
