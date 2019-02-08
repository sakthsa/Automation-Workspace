package com.ss.Collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class DuplicateList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> lst = new ArrayList<>();
		lst.add("One");
		lst.add("Two");
		lst.add("2");
		lst.add("1");
		//lst.add(null);
		lst.add("One");
		lst.add("Two");
		//lst.add(null);
		System.out.println(lst);
		
		List<Object> lst3 = new ArrayList<>();
		lst3.add(2);
		lst3.add("5");
		
		
		List lst2 = lst.stream().distinct().collect(Collectors.toList());
		System.out.println(lst2);
		Set<String> set = new TreeSet(lst);
		
		List<String> lst1=new ArrayList<>(set);
		System.out.println(lst1);

	}

}
