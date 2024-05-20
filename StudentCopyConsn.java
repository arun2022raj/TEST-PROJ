package com.copycon;

public class StudentCopyConsn{
	String name="jakkam";
	int rollno=101;
	StudentCopyConsn(){
		
	}
	StudentCopyConsn(StudentCopyConsn reff){
		this.name=reff.name;
		this.rollno=reff.rollno;
	}
	public static void main(String[] args){
		StudentCopyConsn sc=new StudentCopyConsn();
		System.out.println(sc.name+"   "+sc.rollno);
		sc.name="arun";
		StudentCopyConsn sc1=new StudentCopyConsn(sc);
		System.out.println(sc1.name+"   "+sc1.rollno);

	}
	
}
