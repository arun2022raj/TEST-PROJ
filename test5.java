

public class test5 extends RuntimeException{
	// static ArithmeticException e = new ArithmeticException();
	// static ArithmeticException e ;
	// public static void rec(int i){ rec(i+1);}
	// public static void m2(){
		// System.out.println("pagal");
		// throw new ArithmeticException("dandam ra duta");
	// }
	public static void m1(){
		System.out.println("pagal");
		// throw e;
		throw new test();
	}
    

    public static void main(String[] args) {
		
		
		m1();
		
		// try{
		// System.out.println(10/0);
		// }
		// catch(ArithmeticException e){
			// System.out.println("printStackTrace : ");
			// e.printStackTrace();
			// System.out.println("toString : "+e.toString());
			// System.out.println("getMessage : "+e.getMessage());
		// }
		// catch(ArithmeticException e){
			// e.printStackTrace();
		
		// }
		// catch(ArithmeticException e){

		// }
		
		// try{
			// System.out.println(10/0);
			// Thread.sleep(1000);
		// }
		// catch(InterruptedException e){
			
		// }
		// finally{
			// System.out.println("pagal hey thu sale");
		// }
		
		// try{
			// System.out.println("try");
			// System.out.println(10/0);
			
		// }
		// catch(ArithmeticException e){
			// System.out.println("catch");
		// }
		// finally{
			// System.out.println("finally");
		// }
		
		// try{
			// System.out.println("try");
			// System.out.println(10/0);
			
		// }
		// catch(NullPointerException e){
			// System.out.println("catch");
		// }
		// finally{
			// System.out.println("finally");
		// }
		
		
		// try{
			// System.out.println("try");
			// System.exit(0);
			// rec(1);
			// System.out.println(10/0);
			
		// }
		// catch(NullPointerException e){
			// System.out.println("catch");
		// }
		// finally{
			// System.out.println("finally");
		// }
		
		
		// try{
			// System.out.println("try");
			// try{
				// System.out.println(10/0);
			// }
			// catch(ArithmeticException e){
				// System.out.println(10/2);
			// }
			// finally{
				// System.out.println("nested finally in try");
			// }
			
			// Thread.sleep(1000);
			
		// }
		// catch(InterruptedException e){
			// System.out.println("catch");
		// }
		// finally{
			// System.out.println("finally");
		// }
		
		
		
		
		

    }
}






















// import java.lang.Runtime;

// class test{
	
	// static {
		// System.out.println("hello");
	// }
	// int i=10;
	// test(){
		// this(i);
	// }
	// test(int i){
		// this();
	// }
	
	// public static void main(String[] args){
		// m1();
		// Runtime r= new Runtime();
	// }
	// public static void m1(){
		// m2();
	// }
	// public static void m2(){
		// main(new String[]{"1","2"});
	// }
// }