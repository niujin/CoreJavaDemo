
public class ShallowCopy {

	public static void main(String[] args){
		A a = new A();
		//A.B c = new A().new B();
		A a1 = a.clone();
		//a1 refes to a different object than a
		System.out.println(a==a1);

		//however, the fields share same object
		System.out.println(a.b==a1.b);
		System.out.println(a.c==a1.c);

		a.b.d=10;
		System.out.println(a1.b.d);
	}
}
class C{

}

class A extends C implements Cloneable{
	class B{
		public int d=3;
	}
	B b = new B();
	protected int c=2;
	@Override
	public A clone(){
		A a=null;
		try {
			a= (A)super.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return a;
	}
}