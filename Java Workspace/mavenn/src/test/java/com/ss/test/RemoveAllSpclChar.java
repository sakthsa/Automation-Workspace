package com.ss.test;

public class RemoveAllSpclChar {

	public static void main(String[] args) {
		String str = "@##*$*@SanTHoSH29339!$#)%@$%(%&";
		System.out.println(str.replaceAll("[^a-zA-Z0-9]", ""));

	}

}
