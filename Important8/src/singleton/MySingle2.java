package singleton;

public class MySingle2 {
	private static MySingle2 instance = new MySingle2();
	private MySingle2() {}
	public static MySingle2 getInstance(){
		return instance;
	}
}
