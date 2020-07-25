package singleton;

public class MySingle3 { //standard definition, but still has bug
	private static MySingle3 instance;
	private MySingle3() {}
	public static MySingle3 getInstance(){
		if(instance==null){                   //double check
			synchronized(MySingle3.class){
				if(instance==null){
					instance = new MySingle3(); //lazy model
				}
			}
		}
		return instance;
	}

}
