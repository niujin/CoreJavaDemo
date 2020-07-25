package singleton;

public class MySingle1 {
	private static MySingle1 instance;
	private MySingle1() {}
	synchronized public static MySingle1 getInstance(){ //thread safe, bad performance
		if(instance==null){
			instance=new MySingle1();
		}
		return instance;
	}
}
