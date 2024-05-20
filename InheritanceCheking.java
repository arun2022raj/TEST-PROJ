interface Myinterface
{
	void run();
}
class SuperClass
{
	public void run()
	{
		System.out.println("super class running");
	}
}

public class InheritanceCheking extends SuperClass implements Myinterface
{
	public void run(){
		System.out.println("Inheritance cheking is running");
	}
	public static void main(String[] args)
	{
		SuperClass in=new InheritanceCheking();
		in.run();
	}
}