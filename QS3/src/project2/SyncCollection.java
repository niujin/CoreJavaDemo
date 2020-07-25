package project2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SyncCollection {

	/**
	 * @param args
	 */
	public static List<Integer> li = new ArrayList<Integer>();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//List<Integer> sli = Collections.synchronizedList(li);
		for(int i=0;i<100;i++){
			new Thread(new Runnable(){
				@Override
				public void run(){
					li.add(new Integer(1));
				}
			}).start();
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		System.out.println(li.size());
	}

}
