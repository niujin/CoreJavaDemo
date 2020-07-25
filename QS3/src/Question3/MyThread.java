package Question3;

public class MyThread {
	public void go() {
		Runnable r=new Runnable() {
			public void run() { System.out.print("foo"); }
		};
		Thread t=new Thread(r);
			t.start(); t.start();
		}

	public static void main(String[] args) {
		new MyThread().go();
	}
}
