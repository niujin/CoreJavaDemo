package cloneable2;

public class A implements Cloneable{
	String str;
	B b;
	A(String str){
		this.str=str;
	}

	@Override
	public A clone(){
		A a = null;
		try{
			a = (A)super.clone();
		}catch(CloneNotSupportedException e){
			e.printStackTrace();
		}

		a.b = new B();
		a.b.c = this.b.c;
		return a;
	}
}

class B{
	int c;
}
