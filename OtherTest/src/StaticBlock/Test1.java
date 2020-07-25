package StaticBlock;

public class Test1 {
	static int a=5;
	static A a1; 
	static{
		System.out.println("hello");
		System.out.println(a);
	}
	public static void main(String[] args){
		
	}
	
}
class A{
	static int a =5;
	static int b =5;		
}