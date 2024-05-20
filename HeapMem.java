import java.lang.reflect.*;



class HeapMem
{
	public static void main(String[] args) throws ClassNotFoundException{
		
		Class<?> c=Class.forName("java.lang.Object");
		Method[] m1=c.getDeclaredMethods();
		
		for (Method m:m1){
			System.out.println(m.getName());
		}
		
		
		
		Runtime r=Runtime.getRuntime();
		
		double d=1024*1024;

		System.out.println("in bytes");
		System.out.println("\n\n\n maximum memoryt : "+r.maxMemory());
		System.out.println("total memoryt : "+r.totalMemory());
		System.out.println("free memoryt : "+r.freeMemory());
		System.out.println("consumed memoryt : "+(r.totalMemory()-r.freeMemory()));

		System.out.println("in mb double");
		System.out.println("\n\n\n maximum memoryt : "+r.maxMemory()/d);
		System.out.println("total memoryt : "+r.totalMemory()/d);
		System.out.println("free memoryt : "+r.freeMemory()/d);
		System.out.println("consumed memoryt : "+(r.totalMemory()-r.freeMemory())/d);
			
		System.out.println("in mb without double");
		System.out.println("\n\n\n maximum memoryt : "+r.maxMemory()/(1024*1024));
		System.out.println("total memoryt : "+r.totalMemory()/(1024*1024));
		System.out.println("free memoryt : "+r.freeMemory()/(1024*1024));
		System.out.println("consumed memoryt : "+(r.totalMemory()-r.freeMemory())/(1024*1024));
				
		
		
	}

}
