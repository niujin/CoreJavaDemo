package innerclass;

public class InnerTest {

	/**
	 * @param args
	 */
	
	class Inner1{
		public void add(int a){
			int c = a+ 10;
			System.out.println(c);
		}
	}
	static class Inner2{
		
	}

	public void foo(){
		final int i=10; 
		class LocalInner{
			public void add(int a){
				int c = a+ i; 			//local inner class can only access final local variables.
				System.out.println(c);
			}	
		}
		LocalInner li = new LocalInner();
		li.add(i);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InnerTest it = new InnerTest();
		it.foo();
		InnerTest.Inner1 t= it.new Inner1();
		int x =20;
		t.add(x);
	}

}
