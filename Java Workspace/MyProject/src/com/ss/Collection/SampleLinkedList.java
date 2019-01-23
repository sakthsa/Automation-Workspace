package com.ss.Collection;

import java.util.LinkedList;
import java.util.List;

public class SampleLinkedList {
	int id;
	String name;
	SampleLinkedList(int id,String name){
		this.id = id;
		this.name = name;
	}
	public static void main(String[] args) {
		SampleLinkedList sl1 = new SampleLinkedList(1,"Santhosh");
		SampleLinkedList sl2 = new SampleLinkedList(2,"Sathish");
		SampleLinkedList sl3 = new SampleLinkedList(3,"Rajesh");
		List<SampleLinkedList> lst = new LinkedList<>();
		lst.add(sl1);
		lst.add(sl2);
		lst.add(sl3);
		for (SampleLinkedList s : lst) {
			System.out.println(s.id+" "+s.name);
			
		}
		System.out.println(lst.size());
		lst.remove(sl2);
		System.out.println(lst.size());
		
		lst.contains(sl1);
	}

}
