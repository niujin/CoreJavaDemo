package Example3;

import java.io.Serializable;
	
public class A implements Serializable{
	static int m=5;
	transient int x=1234567;
	final double d=3.1415926;
	boolean b=false;
//	public boolean isB() {
//		return b;
//	}
//	public void setB(boolean b) {
//		this.b = b;
//	}
	//ReadObject o = new ReadObject();
}
