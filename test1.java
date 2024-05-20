

class test1{
	static test1 t= new test1();
	{
		System.out.println("hello");
	}
	public static void main(String[] args)
	{
		
	}
	
}



// class P {
    // public void m1(int... x) {
        // System.out.println("parent");
    // }
// }

// class C extends P {
    // public void m1(int x) {
        // System.out.println("child");
    // }
// }

// public class test1 {
    // static {
        // P p = new P();
        // p.m1();
        // C c = new C();
        // c.m1();
        // P p1 = new P();
        // p1.m1();
    // }
// }




// class P
// {
	// public void m1(int... x)
	// {
		// System.out.println("parent");
	// }
// }
// class C extends P
// {
	// public void m1(int x)
	// {
		// System.out.println("child");
	// }
// }
// public class test1
// {
	// static
	// {
		// P p=new P();
		// p.m1();
		// C c= new C();
		// c.m1();
		// P p1=new P();
		// p1.m1();
		
	// }
// }



// class P
// {
	// public void m1(String x)
	// {
		// System.out.println(x);
	// }
// }
// class C extends P
// {
	// public void m1(int x)
	// {
		// System.out.println(x);
	// }
// }
// public class test1
// {
	// public static void main(String[] args)
	// {
		// P p=new P();
		// p.m1("arun");
		// C c= new C();
		// c.m1(10);
		// P p1=new C();
		// p1.m1("arun");
		// C c1=(C)p1;
		// c1.m1(78);
		
	// }
// }