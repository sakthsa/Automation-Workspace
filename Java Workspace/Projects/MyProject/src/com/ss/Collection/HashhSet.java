package com.ss.Collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class HashhSet {

	public static void main(String[] args) {
		HashSet<String> set = new HashSet<>();
		set.add("One");    
        set.add("Two");    
        set.add("Three");   
        set.add("Four");  
        set.add("Five");
        set.add(null);
        set.add(null);
        System.out.println(set);
        Iterator<String> itr = set.iterator();
        while(itr.hasNext()) {
        	System.out.println(itr.hashCode());
        	System.out.println(itr.next());
        }
        
        

	}

}
