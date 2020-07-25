package project2;

public class InterruptTest implements Runnable{

	/**
	 * @param args
	 */
	@Override
	public void run(){
		while (true) {
			if (Thread.currentThread().isInterrupted()) {
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				// System.out.println("Thread is running");
				System.out.println("Thread is interrupted but still running");
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t = new Thread(new InterruptTest());
		t.start();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		t.interrupt();
	}

}
