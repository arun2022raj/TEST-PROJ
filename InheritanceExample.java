package com.inheritence;

public class InheritanceExample
{
	public static void main(String[] args)
	{
		Parent p=new Parent(10);
		p.m1();
		Child1 c1= new Child1(10,20);
		System.out.println("calling parent method with child");
		c1.m1();
		System.out.println("calling child method with child");
		c1.m2();
		// Parent c2= new Child1();
		// c2.m1();
		// c2.m2();
		Child2 c2= new Child2(10,30);
		System.out.println("calling parent method with child2");
		c2.m1();
		System.out.println("calling child method with child2");
		c2.m3();
		System.out.println("this is from grand child");
		
		grandChild gc= new grandChild(10,20,40);
		gc.m1();
		gc.m2();
		gc.m4();
		
		
		
		
	}
}
class Parent
{
	int i;
	final static int m;
	static
	{
		m=10;
	}
	// {
		// i=10;
	// }
	Parent(int i)
	{
		this.i=10;
	}
	public void m1()
	{
		System.out.println("this is parent class"+i);
	}
}
class Child1 extends Parent
{
	int j;
	// {
		// j=20;
	// }
	Child1(int i,int j)
	{
		super(i);
		this.j=j;
		
	}
	public void m2()
	{
		m1();
		System.out.println("this is child1 class"+j);
		
	}
}
class Child2 extends Parent
{
	int k;
	// {
		// k=30;
	// }
		// Child2(int i,int k)
		// {
			// super(i);
			// this.k=k;
			
		// }
	Child2(int i,int k)
	{
		super(i);
		this.k=k;
		
	}
	public void m3()
	{
		m1();
		// m2();
		System.out.println("this is Child2 class"+k);
	}
}
class grandChild extends Child1
{
	int l;
	// {
		// l=40;
	// }
	grandChild(int i,int j,int l)
	{
		super(i,j);
		this.l=l;
	}
	public void m4()
	{
		m1();
		m2();
		System.out.println("this is grandchild class"+l);
		
	}
}
