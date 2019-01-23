package com.ss.test;

abstract class AA {
	void m(){
		System.out.println("AA m");
	}
	
	class B extends AA{
		void n() {
			System.out.println("B n");
			//new AA();
			n();
		}
	}
	

	}


