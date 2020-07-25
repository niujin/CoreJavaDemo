package VisitCollection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class VistitSet {
	
	static void visitset(){
		Set<String> s = new HashSet<String>();
		s.add("a");
		s.add("b");
		s.add("c");
		for(String str:s){
			System.out.println(str);
		}
		Iterator<String> it = s.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
	}
}
