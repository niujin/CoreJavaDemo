

public class Useclone implements Cloneable{

	/**
	 * @param args
	 */
	class Base {
		private int a=5;
		 void foo1()
		{
			System.out.println("foo1 in Base");
		}
		public void doIt (int... vals)
		{
			System.out.println("foo2 in Base");
		}
	}
	class Boot
	{
		int boot;
		String foot;
		Boot()
		{
			this("foot");
			System.out.println("first");
		}
		Boot(String foot)
		{
			this(420,"foot");
			System.out.println("second");
		}
		Boot(int boot,String foot)
		{
			this.boot=boot;
			this.foot=foot;
			System.out.println("third");
		}
	}
	


	enum Color {RED, YELLOW, GREEN};
	public static void main(String[] args) throws CloneNotSupportedException{
		// TODO Auto-generated method stub
		Useclone u = new Useclone();
		//u.clone();
		u.q1();
		/*String s1 = new String("abc");
		String s2 = new String("abc");
		String s3 ="abc";
		String s4 = "abc";
		System.out.println(s1==s2);
		System.out.println(s2==s3);
		System.out.println(s3==s4);
		System.out.println(s1.equals(s3));
		System.out.println(s1.intern()==s2.intern());
		System.out.println(s1.intern()==s3.intern());*/
		
//		Useclone.Base b = u.new Base();
//		b.a=3;
		
		//System.out.println();
	}
	public void q1()
	{
	/*	Color color = Color.RED;
		switch(color)
		{
			//default: System.out.println("Z");
			case GREEN: System.out.println("A");
			case RED: System.out.println("B"); break;
			case YELLOW: System.out.println("C");
		}*/
		//short x =6;
		//long y =7;
		//foo(x);
		//foo(y);
		//System.out.println(str1);
		Boot b =new Boot();
		System.out.println(b.boot+" "+b.foot);
	}
	
	public void foo(Short x)
	{
		System.out.println("Short: "+x);
	}
	public void foo(Long x)
	{
		System.out.println("Long: "+x);
	}
	public void foo(int x)
	{
		System.out.println("int: "+x);	
	}

}
