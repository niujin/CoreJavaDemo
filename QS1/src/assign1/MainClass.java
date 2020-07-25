package assign1;

import java.util.Random;

public class MainClass {

	/**
	 * @param args
	 */
	
	public int a[]=new int[10];
	public void creatRandomNum(){
		Random random=new Random();
		for(int i=0;i<10;i++){			
			a[i]=random.nextInt(1000);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MainClass m =new MainClass();

		m.creatRandomNum();
		BubbleSort bs = new BubbleSort();
		InsertSort is = new InsertSort();
		MergeSort ms = new MergeSort();
		QuickSort qs = new QuickSort();
//		for(int i=0;i<10;i++){
//			System.out.println(m.a[i]);
//		}
		qs.sort(m.a);
		for(int i=0;i<10;i++){
			System.out.println(m.a[i]);
		}
	}
}
