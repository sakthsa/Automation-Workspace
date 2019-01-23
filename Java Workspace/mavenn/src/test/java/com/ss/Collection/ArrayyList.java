package com.ss.Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Objects;

public class ArrayyList {

	public static void main(String[] args) {
		String str;
		ArrayList<String> arrList = new ArrayList();
		ArrayList<String> arrList2 = new ArrayList();
		arrList2.add("Four");
		arrList.add("One");
		arrList.add("Two");
		arrList.add(null);
		arrList.add("Three");
		arrList.add(1, "Four");
		arrList.add(null);
		arrList.removeAll(arrList2);
		Iterator<String> itr = arrList.iterator();
		
		while(itr.hasNext()) {
			str = itr.next();
			//if(!str.equals("Three")) 
			{
				System.out.println(str);	
			}
			
			
		}
		System.out.println(arrList);
		arrList.removeIf(Objects::isNull);
		System.out.println(arrList);

	}

}
