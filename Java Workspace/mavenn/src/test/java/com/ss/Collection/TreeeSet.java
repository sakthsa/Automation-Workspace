package com.ss.Collection;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class TreeeSet {

	public static void main(String[] args) {
		TreeSet<String> set = new TreeSet<>();
		set.add("One");
		set.add("Two");
		set.add("Four");
		System.out.println(set);
		
		System.out.println(set.descendingSet());
		System.out.println(set.tailSet("One",false));
		//set.stream().filter(null);
		TreeSet<Object> set2 = new TreeSet<>();
		
	}

}
