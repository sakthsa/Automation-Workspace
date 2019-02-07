package com.ss.Collection;

import java.util.HashMap;

public class Hashhmap {
	public static void main(String args[]) {
		String str = "santhosh";
		HashMap<Character, Integer> map = new HashMap<>();
		char[] chr = str.toCharArray();
		for(char c : chr) {
			if(map.containsKey(c)) {
				map.put(c, map.get(c)+1);
			}
			else {
				map.put(c, 1);
			}
		}
		System.out.println(map);
		
		for (char c : map.keySet()) {
			if(map.get(c)>1) {
				System.out.println("Duplicate Values are : "+c);
			}
		}
		
	}
	
	

}
