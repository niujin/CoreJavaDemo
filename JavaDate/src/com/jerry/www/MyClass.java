package com.jerry.www;

public class MyClass implements DefaultMethDemo {

	@Override
	public int foo() {
		
		return 0;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		System.out.println();
		MyClass c1 = new MyClass();
		c1.bar();
		DefaultMethDemo.goo();

	}

}
