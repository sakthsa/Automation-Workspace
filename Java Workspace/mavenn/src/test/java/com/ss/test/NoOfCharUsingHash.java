package com.ss.test;

import java.util.HashMap;
import java.util.Map;


public class NoOfCharUsingHash {
	
	public static void main(String[] args) {
		String str = "Dfjffjfjfjjd";
		
		char[] chr = str.toCharArray();
		Map<Character, Integer> m = new HashMap();
		for(char c : chr) {
			if(m.containsKey(c)) {
				m.put(c, m.get(c)+1);
			}
			else {
				m.put(c, 1);
			}
		}
		System.out.println(m);
	}
}
