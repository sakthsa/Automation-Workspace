package com.ss.test;

public class ThisTest {
	void m() {
		System.out.println("Hello World I am in m");
	}
	void n() {
		m();
	}
	ThisTest(){
		this("");
		System.out.println("Default constructor");
		
	}
	ThisTest(String str){
		System.out.println("String constructor");
		
	}
	public static void main(String[] args) {
		ThisTest t = new ThisTest();
		t.n();
		
	}

}
