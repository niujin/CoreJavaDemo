package project2;

public class DeadLockTest implements Runnable{

	/**
	 * @param args
	 */
	static Chop a = new Chop(1);
	static Chop b = new Chop(2);
	public int i;
	DeadLockTest(int i){
		this.i=i;
	}
	
	@Override
	public void run(){
		if(i==1){
			synchronized(a){
				System.out.println("Resourse "+a.ID+" is allocated to thread "+i);
				try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				synchronized(b){
					System.out.println("Requesting resourse "+b.ID);
				}
			}
		}
		if(i==2){
			synchronized(b){
				System.out.println("Resourse "+b.ID+" is allocated to thread "+i);
				try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				synchronized(a){
					System.out.println("Requesting resourse "+a.ID);
				}
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DeadLockTest dlt1 = new DeadLockTest(1);
		DeadLockTest dlt2 = new DeadLockTest(2);
		new Thread(dlt1).start();
		new Thread(dlt2).start();
		
	}

}
