package com.ss.test;

public class StrFunc {

	public static void main(String[] args) {
		String str = "I am married";
		String revStr = "";
		
		String[] splitStr = str.split("\\s");
		System.out.println(splitStr.length);
		
		for(String s:splitStr) {
			String locRevStr = "";
			
			for(int i =s.length()-1;i>=0;i--) {
				locRevStr = locRevStr+s.charAt(i);
				
			}
			revStr = revStr+locRevStr+" ";
			
			
		}
		System.out.println(revStr);
		String ExpectedStr = revStr.trim();
		System.out.println(ExpectedStr);
	}

}
