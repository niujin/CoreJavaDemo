package instance;

public class Demo1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B b = new B();
		A a = new A();
		A c = (A)b;
		System.out.println(b instanceof A);
		System.out.println(a instanceof B);
		System.out.println(c instanceof B);
	}

}

class A{
	
}

class B extends A{
	
}