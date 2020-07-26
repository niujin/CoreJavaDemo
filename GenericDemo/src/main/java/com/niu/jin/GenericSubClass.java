package com.niu.jin;

import java.util.ArrayList;
import java.util.List;

public class GenericSubClass<T> {

	public <E extends Object> void foo(List<? extends Object> list){
		
	}
	T t1;

	//static method doesn't have access to the class's type parameter
	/*
	public static T foo(){
		return null;
	}
	 */

	//non-static can use type parameter
	public T bar(){
		return null;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//SubClass<? extends Object> c = new SubClass<Object>();
		SubClass5<String, Integer> sb5 = new SubClass5<>();
		//t1 type informaiton is lost, so might be Ojbect?
		sb5.t1 = new ArrayList<Integer>();
		//t2 is Integer type
		// sb5.t2 = new ArrayList<Integer>();
		System.out.println(sb5.t1.getClass());
	}

}

//Regular usage, super class must use one of the identifiers in subclass
class SubClass<T,E> extends GenericSubClass<E>{
	
}
/* compilation error
class SubClass<T,E> extends GenericTest<F>{

}

 */

//here String is not the String class, it's just a identifier same as T.
class SubClass1<String> extends GenericSubClass<String>{

}

//When subclass is not generic, the type parameter in super class should be ignored

/* wrong
class SubClass1 extends GenericTest<T>{

}

 */
//correct
class SubClass2 extends GenericSubClass{

}



//but you can put a specific type like String. In this case the T in supertype will have it's type as String
class SubClass3 extends GenericSubClass<String>{
	{
		t1.toUpperCase();
	}

}

//You can also put a specific type even if subclass is generic
class SubClass4<T> extends GenericSubClass<String>{
	{
		t1.toUpperCase();
	}

	public void test(){
		String s = bar();
	}
}

class SubClass5<E,T> extends GenericSubClass{
	T t2;
	E e2;

}

//Sub class type parameters can't less than super class's
/*
class SubClass6<T> extends SubClass5<E,T>{
	T t2;

}

 */
