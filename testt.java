	 package com.ajacs.emp;
	 public class testt
{
	// abstract void m1();
	// abstract public void m2();
	protected  void me(){
		System.out.println("arun");
	}

}
	 class test1 extends test
{
	// final void m1()
	// {
		// System.out.println("jakkam");
	// }
	
	public static void main(String[] args)
	{
		test1 t= new test1();
		t.me();
		test tt= new test();
		t.me();
		test ttt= new test1();
		ttt.me();
		// test tttt= new test1();  test.java:25: error: incompatible types: test1 cannot be converted to test
		// tttt.me();
	}
}

