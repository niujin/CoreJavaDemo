package test;

public class ThreadBasic {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t= new Thread(new ThreadTest(),"thread-1");
		t.start();
		//System.out.println("******before******");
		t.interrupt();
		System.out.println("*******after******");
		System.out.println(t.isInterrupted());
	}

}