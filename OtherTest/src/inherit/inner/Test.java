package inherit.inner;

public class Test {

	/**
	 * @param args
	 */
	public static void foo(Integer i){
		i=6;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//A a = new A();
		D d = new D();
		D.B b = d.new B();
		//A.B b1 = new A.B();
		A[] a = new A[]{};
		Integer it = new Integer(5);
		foo(it);
		System.out.println(it);
	}

}

class A{
	class B{
		
	}
}

class C extends A.B{
	C(){
		new A().super();
		
	}
	C(A a){
		a.super();
	}
}
class D extends A{
	
}