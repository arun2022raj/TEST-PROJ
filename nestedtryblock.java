import java.io.FileReader;
import java.io.FileWriter;
import java.io.*;

class nestedtryblock{
	public static void main(String[] args){
		try{
		FileReader i= new FileReader("abs.txt");
		int c;
		while((c=i.read())!=-1){
			char ch=(char) c;
		}
		int r=10/c;
		FileWriter j=new FileWriter("abw.txt");
		j.write('r');
		}
		catch(IOException e)
		{
			
		}
		
	}
}