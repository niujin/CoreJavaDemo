package Example2;

public class Base {
	static {System.out.println("static in Base");}
	Base() {System.out.println("Base");}
	public static void main(String args[]){
		new Sub();
	}
}
