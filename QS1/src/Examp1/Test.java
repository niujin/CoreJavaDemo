package Examp1;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Base b = new Derived();
		System.out.println(b.getValue());
		System.out.println(Base.value);
		System.out.println(Derived.value);
		Derived.value=20;
		System.out.println(Base.value);
		System.out.println(Derived.value);
	}

}
