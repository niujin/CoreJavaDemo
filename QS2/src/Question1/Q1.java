package Question1;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;

public class Q1 {

	/**
	 * @param args
	 */
	
	public static Collection get(){
		Collection c = new LinkedList();
		c.add("A");
		c.add("B");
		c.add("C");
		return c;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(Object o:get()){
			System.out.println(o);
		}
	}

}
