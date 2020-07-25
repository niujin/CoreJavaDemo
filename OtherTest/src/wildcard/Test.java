package wildcard;

import java.util.ArrayList;
import java.util.List;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A<? super Child> a = new A<Parent>();
		a.set(new Child());
		Object p=a.get();
		System.out.println(p);
		List l = new ArrayList();
		l.add(4);
		System.out.println(l.get(0));
	}

}

class A<T>{
	private T t;
	public void set(T a){
		System.out.println("good");
	}
	public T get(){
		return t;
	}
	
}

class Parent{
	
}
class Child extends Parent{
	
}
class GrandChild extends Child{
	
}