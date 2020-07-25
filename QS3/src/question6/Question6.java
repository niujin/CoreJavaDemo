package question6;

public class Question6 implements Runnable {
	public void run() { 
		for (int i=0; i<4; i++) System.out.print(i);
	}
	public static void main(String[] args) throws Exception {
		Thread t=new Thread(new Question6());
		t.start();
		Thread.sleep(5);
		System.out.print("Started");
		t.join();
		System.out.print("Complete");
	}
}

