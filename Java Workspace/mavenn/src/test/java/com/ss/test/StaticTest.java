package com.ss.test;

public class StaticTest {
	static {
		System.out.println("Hello Static method");
		System.exit(0);
	}
	int id;
	String name;
	static String college = "Adhiymaan";
	
	StaticTest(int id, String name){
		this.id = id;
		this.name = name;
	}
	
	void display() {
		System.out.println(id+ " "+name +" "+college);
	}
	public static void main(String[] args) {
		StaticTest s1 = new StaticTest(1, "Santhosh");
		StaticTest s2 = new StaticTest(2, "Santhu");
		s1.display();
		s2.display();
		System.out.println(s1.college);
		System.out.println(s2.college);
		
	}
	

}
