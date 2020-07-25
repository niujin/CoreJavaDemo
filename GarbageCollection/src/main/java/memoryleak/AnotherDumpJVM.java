package memoryleak;

import java.util.ArrayList;
import java.util.List;

public class AnotherDumpJVM {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List list = new ArrayList();
		Object a;
		while(true){
			a = new Object();
			list.add(a);
		}
	}

}
