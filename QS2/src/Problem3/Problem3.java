package Problem3;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Set;

public class Problem3 {

	/**
	 * @param args
	 */
	enum Examples{ONE,TWO,THREE};
	int a=1;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Collection coll = new ArrayList();
		coll.add(Examples.THREE);
		coll.add(Examples.THREE);
		coll.add(Examples.THREE);
		coll.add(Examples.TWO);
		coll.add(Examples.TWO);
		coll.add(Examples.ONE);
		Set set = new HashSet(coll);
		System.out.println(coll.size()+"\t"+set.size());
		
	}
	public void test(){
		
	}
	
}
