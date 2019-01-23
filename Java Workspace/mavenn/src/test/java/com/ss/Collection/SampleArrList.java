package com.ss.Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class SampleArrList {

	public static void main(String[] args) {
		List<String> lst = new ArrayList<>(2);
		lst.add("one");
		lst.add("one");
		lst.add("Two");
		lst.add("Three");
		lst.add("Four");
		System.out.println(lst);
		List lst2 = new ArrayList<>(lst);
		System.out.println(lst2);
		lst.add("Five");
		System.out.println(lst);
		System.out.println(lst2.lastIndexOf("Three"));
		System.out.println(lst.containsAll(lst2));
		lst.removeIf(str -> str.contains("Five"));
		System.out.println(lst);
		System.out.println(lst.indexOf("one"));
		System.out.println(lst.lastIndexOf("one"));
		ListIterator itr = lst.listIterator(lst.size());
		itr.hasPrevious();
	
	}

}
