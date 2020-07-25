package q15;

public class Base {
	int a = 5;
	
	Base(){
		foo();
	}
	
	void foo(){
		System.out.println(a);
	}
	
	public static void main(String[] args){
		new Sub();
	}
}

class Sub extends Base{
	private int a =6;
	
	void foo(){
		System.out.println(a);
	}
}
