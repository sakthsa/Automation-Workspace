package com.ss.test;

class A{  
A getA(){
	System.out.println("Hello baby");
return this;  
}  
void msg(){System.out.println("Hello java");}  
}  
class Test1{  
public static void main(String args[]){  
new A().getA().msg();  
}  
} 