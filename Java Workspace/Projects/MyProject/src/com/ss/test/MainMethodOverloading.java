package com.ss.test;

public class MainMethodOverloading {
	public static void main(String[] args){
		System.out.println("main with String[]");
		main();
		
		}  
	public static void main(String args[],String ar[]){
		System.out.println("main with String");
		}  
	public static void main(){
		System.out.println("main without args");
		String a[] = null;
		String b[] = null;
		main(a,b);
		} 

}
