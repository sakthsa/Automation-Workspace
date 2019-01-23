package com.ss.test;

import java.util.Scanner;

public class Prime {
	public static void main(String args[]) {
		Scanner scn = new Scanner(System.in);
		System.out.print("Enter the starting number : ");
		int start = scn.nextInt();
		System.out.println("Enter the ending number : ");
		int end = scn.nextInt();
		System.out.println("List of Prime numbers :");
		for(int i = start; i<=end; i++) {
			if (isPrime(i)) {
				System.out.println(i);
			}
		}
		
	}
	
	public static boolean isPrime(int n){
		if (n<=1) {
			return false;
		}
		else {
			for (int i =2; i<=n/2; i++) {
				if(n%i==0) {
					return false;
					
				}
				
			}
			return true;
			
		}
	}

}
