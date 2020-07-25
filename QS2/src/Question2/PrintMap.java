package Question2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class PrintMap {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("b", 5);
		map.put("a", 7);
		map.put("c", 3);
		map.put("d", 8);
		printMap(map);
		
	}
	public static void printMap(Map<String, Integer> m){
		List<Map.Entry<String, Integer>> al= new ArrayList<Map.Entry<String,Integer>>();
		Set <Map.Entry<String, Integer>> entries = m.entrySet();
		for(Map.Entry<String, Integer> m1:entries){
			al.add(m1);
		}
		Collections.sort(al,new Comparator<Map.Entry<String, Integer>>(){
			@Override
			public int compare(Map.Entry<String, Integer> a, Map.Entry<String, Integer> b){
				if(a.getValue()<b.getValue()){
					return -1;
				}else if(a.getValue()==b.getValue()){
					return 0;
				}else{
					return 1;
				}
			}
		});
		for(Map.Entry<String, Integer> m1:al){
			System.out.println(m1.getKey()+" "+m1.getValue());
		}
	}

}
