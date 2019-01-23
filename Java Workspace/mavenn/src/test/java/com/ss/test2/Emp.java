package com.ss.test2;

public class Emp {  
int id;  
String name;  
Address address;  
  
public Emp(int id, String name,Address address) {  
    this.id = id;  
    this.name = name;  
    this.address=address;  
}  
  
void display(){  
System.out.println(id+" "+name);  
System.out.println(address.city+" "+address.state+" "+address.country);  
}  
  
public static void main(String[] args) {  
Address address1=new Address("chennai1","chennai2","chennai3");  
Address address2=new Address("salem1","salem2","salem3");  
  
Emp e=new Emp(111,"Santhosh",address1);  
Emp e2=new Emp(112,"Divya",address2);  
      
e.display();  
e2.display();  
      
System.out.println(e2.address.city);
}  
}  