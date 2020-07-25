package com.mercury.inc.q24;

public class Q24 {

	class B{
		//compilation error, inner class can't have static method and field
		//static void foo(){}
		C c = new C();
	}
	static class C {
		static void foo() { }
		void foo2() { }

		//compilation error, static inner class can't instantiate non-static innner class
		//B b=new B();
	}
	static void foo1() {
		//compilation error, static method can't instantiate innner class
		//new B();
		new C();
	}
	void foo2() {
		new B();
		new C();
	}
}
