package initialize;

public class Test {

	/**
	 * @param args
	 */
	static {
		System.out.println("static block Test");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("main function");
		new B();
		System.out.println("********");
		new B();
		//A a=null;
		//MainClass.foo();
	}

}
class A{
	static C c= new C();
	static{
		System.out.println("static block A");
		foo();
	}
	{
		System.out.println("nonstatic block A");
	}
	
	D c1 = new D();
	public static void foo(){
		System.out.println("static function A");
	}
	public void foo1(){
		System.out.println("nonstatic function A");
	}
	public A(){
		System.out.println("constructor A");
	}

	
}
class B extends A{
	static C c= new C();
	static{
		System.out.println("static block B");
	}
	{
		System.out.println("nonstatic block B");
	}
	
	D c1 = new D();
	public static void foo(){
		System.out.println("static function A");
	}
	public void foo1(){
		System.out.println("nonstatic function B");
	}
	
	public B(){
		System.out.println("constructor B");
	}
}
class C{
	C(){
		System.out.println("Constructor C");
	}
}
class D{
	D(){
		System.out.println("Constructor D");
	}
}