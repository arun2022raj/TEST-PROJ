package com.example;

class A
{
	A()
	{
		System.out.println(this.hashCode());
	}

}
class B extends A
{
	B()
	{
		System.out.println(this.hashCode());
	}

}
class ConstTest
{
	public static void main(String[] args)
	{
		B b = new B();
		System.out.println(b.hashCode());
		A a = new A();
		
	}
}