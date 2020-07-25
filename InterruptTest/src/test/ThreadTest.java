package test;

public class ThreadTest implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		long i=1;
		while(i<10000000000l){
			i++;
		}
		System.out.println("before sleep");
//		System.out.println("t ends");
		try{
			Thread.sleep(3000);
		}catch(InterruptedException e){
			e.printStackTrace();
			System.out.println(Thread.currentThread().getName());
			Thread.currentThread().interrupt();
			System.out.println("after interrupt");
		}
//		System.out.println("after sleep");
		
		try{
			System.out.println("second sleep");
			Thread.sleep(5000);

		}catch(InterruptedException e){
			e.printStackTrace();
			System.out.println(Thread.currentThread().getName());
			//Thread.currentThread().interrupt();
			System.out.println("after interrupt");
		}
//		System.out.println("after sleep");
	}
	
}
