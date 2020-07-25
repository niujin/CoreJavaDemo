package project2;
//import java.util.concurrent.TimeUnit;
public class DeamonThread implements Runnable{

	/**
	 * @param args
	 */
	@Override
	public void run(){
		for(int i =0;i<10;i++){
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Deamon has "+(9-i)+" steps left.");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t = new Thread(new DeamonThread());
		t.setDaemon(true);
		t.start();

		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Main thread stops");
	}

}
