


// interface Absclass
// {
	// void run();
	// void walk();
	// void stop();
// }
// class Impclass implements Absclass
// {
	// public void run(){
		// System.out.println("runnin");
	// }
	// public void walk(){
		// System.out.println("walking");
	// }
	// public void stop(){
		// System.out.println("stop here");
	// }
// }
// class helper
// {
	// public static Absclass getObject()
		// {
			// Absclass obj=(Absclass)new Impclass();
			// return obj;
		// }
// }
// public class Mainclass
// {
	// public static void main(String[] args)
	// {
		// Absclass obj=helper.getObject();
		// obj.run();
	// }
// }





abstract class Absclass
{
	String name;
	int age;
	public abstract void run();
	public abstract void walk();
	public abstract void stop();
}
class Impclass extends Absclass
{
	Impclass(String name,int age)
	{
		super.name=name;
		super.age=age;
	}
	public void run(){
		System.out.println("running");
		System.out.println(this.age);
		System.out.println(this.name);
		
	}
	public void walk(){
		System.out.println("walking");
	}
	public void stop(){
		System.out.println("stop here");
	}
}
class helper
{
	public static Absclass getObject(String name,int age)
		{
			Absclass obj=new Impclass(name,age);
			return obj;
		}
}
public class Mainclass
{
	public static void main(String[] args)
	{
		Absclass obj=helper.getObject("arun",20);
		obj.run();
	}
}
