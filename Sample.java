class Sample2
{
	public void method1()
	{
		System.out.println("hi");
	}
}

abstract class Sample1 extends Sample2
{
	public static void m1()
	{
		System.out.println("this is method 1");
	}
	public static void m2()
	{
		System.out.println("this is method 2");
	}
	public abstract void method1();

}
public class Sample
{
	public static void main(String[] args)
	{
		// Sample1 s= new Sample1();
		// Sample.java:17: error: Sample1 is abstract; cannot be instantiated
                // Sample1 s= new Sample1();
                           // ^
		// 1 error

		// s.m1();
		// s.m2();
		// Sample1.m1();
		// Sample1.m2();
		// Sample1.method1();
		Sample2 s2= new Sample2();
		s2.method1();
		// Number n= new Number();
		// int n1=n.valueof(8);
		// C:\Users\arunr\OneDrive\Desktop\java>javac -d . Sample.java
		// Sample.java:27: error: Number is abstract; cannot be instantiated
						// Number n= new Number();
								  // ^
		// Sample.java:28: error: cannot find symbol
						// int n1=n.valueof(8);
								// ^
		  // symbol:   method valueof(int)
		  // location: variable n of type Number
		// 2 errors

	}
}