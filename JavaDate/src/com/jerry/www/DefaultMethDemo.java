package com.jerry.www;

public interface DefaultMethDemo {
	int foo();
	
	default void bar(){
		System.out.println("good");
	}
	
	static int goo(){
		System.out.println("hello");
		return 1;
	}
}
