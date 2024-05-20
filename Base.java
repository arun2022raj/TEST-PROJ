
class Base
{
	int i=10;
	{
		m1();
		System.out.println("first instance block");
	}
	Base()
	{
		System.out.println("constructor");
	}
	public static  void main(String[] args)
	{
		Base b=new Base();
		System.out.println(" base main ");
	}
	public  void m1()
	{
		System.out.println(j);
	}
	
	{
		System.out.println("second instance block");
	}
	 int j=20;

}
class Derived extends Base
{
	int x=100;
	
	{
		m2();
		System.out.println("derived instance block");
	}
	Derived()
	{
		System.out.println("derived construcotr");
	}
	public static void main(String[] args)
	{
		// Base.main(new String[] {"arun","rajes"});
		Derived d= new Derived();
		System.out.println("derived main");
	}
	public  void m2(){
		System.out.println(y);
	}
	{
		System.out.println("derived second instance block");
	}
	int y=200;
}









// class Base
// {
	// static int i=10;
	// static{
		// m1();
		// System.out.println("static block");
	// }
	// public static  void main(String[] args)
	// {
		// m1();
		// System.out.println(" base main ");
	// }
	// public static void m1()
	// {
		// System.out.println(j);
	// }
	// static
	// {
		// System.out.println("second static block");
	// }
	// static int j=20;

// }
// class Derived extends Base
// {
	// static int x=100;
	// static
	// {
		// m2();
		// System.out.println("derived static block");
	// }
	// public static void main(String[] args)
	// {
		// m2();
		// Base.main(new String[] {"arun","rajes"});
		// System.out.println("derived main");
	// }
	// public static void m2(){
		// System.out.println(y);
	// }
	// static{
		// System.out.println("derived second static block");
	// }
	// static int y=200;
// }