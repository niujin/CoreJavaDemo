package comparable.vs.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<A> list = new ArrayList<A>();
		list.add(new A(5));
		list.add(new A(3));
		list.add(new A(7));
		//Collections.sort(list);
		Collections.sort(list, new Comparator<A>(){
			@Override
			public int compare(A a,A b){
				if(a.x>b.x){
					return 1;
				}else if(a.x==b.x){
					return 0;
				}else{
					return -1;
				}
			}
		});
		for(A a:list){
			System.out.println(a.x);
		}
	}

}
