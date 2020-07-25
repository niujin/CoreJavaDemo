package VisitCollection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class VisitList {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = new ArrayList<String>();
		list.add("a");
		list.add("b");
		list.add("c");
		for (String str:list){				//1
			System.out.println(str);
		}
		Iterator<String> it = list.iterator();
		while(it.hasNext()){				//2
			System.out.println(it.next());
		}
		for(int i=0;i<list.size();i++){		//3
			System.out.println(list.get(i));
		}
		//VistitSet.visitset();
		//VisitMap.visitmap();
		
	}

}
