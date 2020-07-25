package tests;

import java.util.HashMap;
import java.util.Map;

public class MainClass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<MyClass, Integer> m = new HashMap<MyClass, Integer>();
		MyClass my = new MyClass();
		m.put(my, 10);
		System.out.println(m.get(my));
	}

}
