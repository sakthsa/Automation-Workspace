package com.ss.Collection;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;

public class LinkeddList {
	public static void main(String args[]) {
		LinkedList<String> lst = new LinkedList<String>();
		lst.add("Hello");
		lst.add("Two");
		
		LinkedList<String> lst2 = new LinkedList<String>();
		//lst2.add("lst2 Hello");
		lst2.add("Hello");
		lst2.add("lst2 Two");
		
		lst.addAll(1, lst2);
		
		System.out.println("Answer : "+lst);
		
		lst.addFirst("Start");
		lst.removeAll(lst2);
		System.out.println("Answer : "+lst);
		
		
		System.out.println(lst);
		
		Collections.sort(lst);
		
		System.out.println("ASCENDING ORDER : "+lst);
		lst2.clear();
		System.out.print("Descending order : ");
		for(int i=lst.size()-1; i>=0; i--) {
			lst2.add(lst.get(i));
		}
		System.out.println(lst2);
		
	
				
	}

}
