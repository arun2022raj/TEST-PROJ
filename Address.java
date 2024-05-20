package com.copycon1;


public class Address{
	String street;
	int hno;
	public Address(String street,int hno){
		this.street=street;
		this.hno=hno;
	}
	public Address(Address add){
		this.street=add.street;
		this.hno=add.hno;
	}
	public static void main(String[] args){
		Address a=new Address("gachibowly",78);
		Address a1= new Address(a);
		a.street="mystreet";
		System.out.println(a.street+"   "+a.hno);
		System.out.println(a1.street+"   "+a1.hno);
		System.out.println(System.identityHashCode(a));
		System.out.println(System.identityHashCode(a));		
		System.out.println(System.identityHashCode(a1));
		System.out.println(System.identityHashCode(a1));
	}
}