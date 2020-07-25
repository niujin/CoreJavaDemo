package VisitCollection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class VisitMap {
	public static void visitmap(){
		Map<Integer, String> m = new HashMap<Integer, String>();
		m.put(1, "a");
		m.put(2, "b");
		m.put(3, "c");
		Set <Integer> keySets = m.keySet();
		for(Integer key:keySets){
			System.out.println(key+m.get(key));
		}
		
		Iterator<Integer> it = keySets.iterator();
		while(it.hasNext()){
			Integer k = it.next();
			System.out.println(k+m.get(k));
		}
		Set<Map.Entry<Integer,String>> entries =m.entrySet();
		for(Map.Entry<Integer, String> e: entries){
			System.out.println(e.getKey()+e.getValue());
		}
		Iterator<Map.Entry<Integer, String>> itr = entries.iterator();
		while(itr.hasNext()){
			Map.Entry<Integer, String> en = itr.next();
			System.out.println(en.getKey()+en.getValue());
		}
	}
}
