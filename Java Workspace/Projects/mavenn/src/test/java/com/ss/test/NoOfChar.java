package com.ss.test;

import static org.testng.Assert.assertEquals;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class NoOfChar {
	public static void main(String[] args) {
		String str = "Santhosh";
		char[] chr = str.toCharArray();
		Set<Character> s = new TreeSet<>();
		for (char c : chr) {
			s.add(Character.toUpperCase(c));
		}
		for(char t : s) {
			int count = 0;
			for(char c : chr) {
					if(Character.toUpperCase(c)==Character.toUpperCase(t)) {
						count++;	
					}
			}
			System.out.println(t+"==> "+count);
		}
		System.out.println(s);
	}
	
	

}
