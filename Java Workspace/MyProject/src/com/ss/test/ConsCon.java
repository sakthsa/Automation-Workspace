package com.ss.test;

public class ConsCon {
	String name;
	int age;
	public static void main (String args[]) {
		ConsCon c1 = new ConsCon("Sandy", 20);
		ConsCon c2 = new ConsCon("Saran", 22);
		System.out.println(c1.name);
		System.out.println(c2.name);
		ConsCon c3 = c2;
		System.out.println(c3.name);
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		c2.name = "Raj";
		System.out.println(c2.name);
		System.out.println(c3.name);
		
	}
	ConsCon(String name, int age){
		this.name = name;
		this.age = age;
	}
	ConsCon(){
		
	}
	

}
