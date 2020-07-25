package basic;

public class MyThread implements Runnable{

	/**
	 * @param args
	 */
	String t="Yes";

	@Override
	public void run(){
		try {
		Thread.sleep(200);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		this.t="No";
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread m = new MyThread();
		new Thread(m).start();
//		try {
//			Thread.sleep(2000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		for(int i=0;i<10;i++){
			System.out.println(m.t);
		}
	}
}
