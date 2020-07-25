package memoryleak;

public class DumpStack {

	/**
	 * @param args
	 */
	public static void foo(){	
		foo();
	}
	public void foo1(){
		foo1();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//foo();		
		DumpStack ds = new DumpStack();
		ds.foo1();
	}

}
