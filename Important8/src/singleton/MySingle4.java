package singleton;

public class MySingle4 {
	
	private MySingle4() {};
	private static class Inner{
		private static MySingle4 instance = new MySingle4();
	}
	public static MySingle4 getInstance(){
		return Inner.instance;
	}

}
