package com.objectex;

class CloneExce  implements Cloneable{
	int i=10;
	int j=20;
	public static void main(String[] args) throws CloneNotSupportedException {
		CloneExce c=new CloneExce();
		// CloneExce c1=c.clone();    CloneExce.java:8: error: incompatible types: Object cannot be converted to CloneExce   CloneExce c1=c.clone();
		// CloneExce c1=(CloneExce)c.clone(); CloneExce.java:9: error: unreported exception CloneNotSupportedException; must be caught or declared to be thrown  CloneExce c1=(CloneExce)c.clone();
		CloneExce c1=(CloneExce)c.clone(); 
		c.i=888;
		c.j=999;
		c1.i=777;
		c1.j=666;
		System.out.println(c.i+" -  "+c.j);
		System.out.println(c1.i+" -  "+c1.j);
	}
}