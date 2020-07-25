package com.mercury.inc;

class Q{
	protected int qq;
}
public class Q1 extends Q{
	//static final int a[];
	//static {a=new int[2];a[0]=100;a[1]=200;}
	//static void init() {a=new int[2];a[0]=100;a[1]=200;}
	public static void main(String args[]){
		Q1 d2 = new Q1();
		d2.qq=3;
		Q d = new Q1();
		d2.qq=5;
	}
		
}

