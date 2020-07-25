package Calculation;

public class Operation implements Runnable{
	Operation(int a, int b, Type type){
		this.a=a;
		this.b=b;
		this.type=type;
	}
	private int a;
	private int b;
	private int c;
	public enum Type{ADD,MULTI};
	public boolean isComplete;
	private Type type;
	
	public void add(int a, int b){
		c =a+b;
		isComplete=true;
		notify();
	}
	public void multi(int a, int b){
		c =a*b;
		isComplete=true;
		notify();
	}
	public synchronized int getResult(){
		while(!isComplete){
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return c;
	}
	@Override
	public synchronized void run(){
		if(type==Type.ADD){
			add(a,b);
		}
		if(type==Type.MULTI){
			multi(a,b);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Operation o1 = new Operation(5,5,Type.MULTI);
		Operation o2 = new Operation(5,5,Type.ADD);
		new Thread(o1).start();
		new Thread(o2).start();
		System.out.println(o1.getResult());
		System.out.println(o2.getResult());
		System.out.println(o1.getResult()/o2.getResult());
	}
}
