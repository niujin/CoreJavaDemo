package project1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class TechSupport {

	/**
	 * @param args
	 */
	static Queue<Client> cqueue = new LinkedList<Client>();
	static int number;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Please input x y z w:");
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		int z = sc.nextInt();
		int w = sc.nextInt();
		number = w;
		int count=0;
		GenerateClient gc = new GenerateClient(z,w);
		new Thread(gc).start();
		while(count<number){
			if(cqueue.isEmpty()){
				try {
					System.out.println("Tech support rests for "+x+" seconds.");
					Thread.sleep(x*1000);
					System.out.println("Tech support goes back from break.");
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}else{
				count++;
				Client current =cqueue.poll();
				System.out.println("Tech support is currently serving customer ("+current.ID+")");
				try {
					Thread.sleep(y*1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("Tech support is finished serving customer ("+current.ID+")");
			}
		}

	}

}
