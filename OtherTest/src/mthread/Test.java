package mthread;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*		Thread t= new Thread(new Runnable(){
			@Override
			public void run() {
				// TODO Auto-generated method stub
				
			}
			
		});
		t.start();
		try {
			t.wait();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		Thread.yield();
		//System.out.println("yield");
	}

}
