package com.objectex;



class Cat{
	int i;
	Cat(int i){
		this.i=i;
	}
}
class Dog implements Cloneable{
	Cat c;
	int j;
	Dog(Cat c,int j){
		this.c=c;
		this.j=j;
	}
	public Object clone() throws CloneNotSupportedException{
		return super.clone();
	}
}

public class ShallowClone{
	public static void main(String[] args)  throws CloneNotSupportedException {
		Cat c=new Cat(20);
		Dog d=new Dog(c,10);
		System.out.println(d.j+"  -  "+d.c.i);
		Dog d1=(Dog) d.clone();
		System.out.println(d1.j+"  -  "+d1.c.i);
		d1.c.i=300;
		System.out.println(d.j+"  -  "+d.c.i);
		System.out.println(d1.j+"  -  "+d1.c.i);
	
	}

} 