package problem6;

public class Problem6 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a = new B();
		//a.process();
	}

}

class A {
	void process() throws Exception {
		throw new Exception();
	}
}
class B extends A {
	
	@Override
	void process() {
		System.out.println("B");
	}
}
