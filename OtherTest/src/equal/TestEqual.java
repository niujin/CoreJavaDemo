package equal;

public class TestEqual {

	/**
	 * @param args
	 */
	String str="a";
	public static boolean isTrue(){
		String world=null;
		return "hello".equals(world);
		//return world.equals("hello");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isTrue());
		Child c  = new Child();
		Child d = c;
		System.out.println(d==c);
		//System.out.println(c.str);
	}

}
class Child extends TestEqual{
	String str="b";
}