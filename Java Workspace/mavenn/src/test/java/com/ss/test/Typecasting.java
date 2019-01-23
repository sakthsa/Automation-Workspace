package com.ss.test;

public class Typecasting {
	public static void main(String...args) {
		int a = 270;
		byte b = (byte)a;
		System.out.println(a);
		System.out.println(b);
		int c = new Integer(10);
		int d = 10;
		if (c==d) {
			System.out.println("Same");
		}
	}

}
