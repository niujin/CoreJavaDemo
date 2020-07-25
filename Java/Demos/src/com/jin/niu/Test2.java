package com.jin.niu;

interface MyInf{
	void foo();
}

class MyClass2 implements MyInf{

	public void foo() {
		System.out.println("MyClass2.foo");
	}
	
}

class MyBase{
	public void f( final int a){
		System.out.println("MyBase.f");
		
		class Inner{
			int a1 =a;
		}
	}
}

class MyClass1 implements MyInf{

	public void foo() {
		System.out.println("MyClass1.foo");	
	}
	
	public void bar(){
		System.out.println("MyClass1.bar");
	}
	
}

class ConsTestBase{
	public ConsTestBase(){
		System.out.println("Base default");
	}
	
	public ConsTestBase(String par){
		System.out.println("Base para: "+par);
	}
}

class ConsTestDeri extends ConsTestBase{
	public ConsTestDeri(){
		System.out.println("Derive default");
	}
	
	public ConsTestDeri(String para){
		System.out.println("Derive para: "+para);
	}
}

public class Test2 {

	public static void main(String[] args) {
/*		MyInf instance = new MyClass2();
		instance.foo();
		MyClass1 myInstance = (MyClass1) instance;
		myInstance.bar();*/
		
/*		MyBase mB = new MyBase(){
			public void f(){
				System.out.println("Anonymous.bar");
			}
		};
		mB.f(5);*/
		new ConsTestDeri("Derive");
		
	}

}
