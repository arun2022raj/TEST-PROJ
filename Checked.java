import java.io.*;


class Checked{
	public static void main(String[] args)throws FileNotFoundException,InterruptedException{
		PrintWriter pw= new PrintWriter("abs.txt");
		pw.println("hello");
		Thread.sleep(1000);
	}
}