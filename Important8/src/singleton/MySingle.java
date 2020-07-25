package singleton;

public class MySingle {
	private static MySingle instance;
	private MySingle() {}
	public static MySingle getInstance(){
		if(instance==null){
			instance=new MySingle();
		}
		return instance;
	}
}
