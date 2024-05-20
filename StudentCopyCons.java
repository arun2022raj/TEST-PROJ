package com.copycon;
import com.copycon1.Address;

public class StudentCopyCons{
	String name;
	int rollno;
	Address add;
	StudentCopyCons(String name,int rollno,Address add){
		this.name=name;
		this.rollno=rollno;
		this.add=add;
		int hashCode = System.identityHashCode(this.add);
		System.out.println("Identity hash code of 'str': " + hashCode);
		
	}
	StudentCopyCons(StudentCopyCons reff){
		this.name=reff.name;
		this.rollno=reff.rollno;
		this.add=new Address(reff.add);
		int hashCode = System.identityHashCode(this.add);
		System.out.println("Identity hash code of 'str': " + hashCode);
	}
	public static void main(String[] args){
		Address a= new Address("myStreet",78);
		StudentCopyCons sc=new StudentCopyCons("jakkam",101,a);
		System.out.println(sc.name+"   "+sc.rollno);
		sc.name="arun";
		StudentCopyCons sc1=new StudentCopyCons(sc);
		System.out.println(sc1.name+"   "+sc1.rollno);

	}	
}
