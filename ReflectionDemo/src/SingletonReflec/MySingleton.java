package SingletonReflec;

public class MySingleton {
	private static MySingleton ms;
	private MySingleton(){}
	public MySingleton getInstance(){
		if(ms==null){
			synchronized(MySingleton.class){
				if(ms==null){
					ms=new MySingleton();
				}
			}
		}
		return ms;
	}
}
