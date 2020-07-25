package bubble;

import java.util.Arrays;

public class BubbleSort {

	/**
	 * @param args
	 */
	private int[]a;
	
	public int[] getA() {
		return a;
	}

	public void setA(int[] a) {
		this.a = a;
	}
	
	public void bubblesort(int low, int high){
		int i,j;
		for(i=low;i<high;i++){
			for(j=high;j>i;j--){
				if(a[j]<a[j-1]){
					exchange(j,j-1);
				}
			}
		}
	}
	
	public void exchange(int i, int j){
		int m =a[i];
		a[i]=a[j];
		a[j]=m;
	}
	
	@Override
	public String toString() {
		return "BubbleSort [a=" + Arrays.toString(a) + "]";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BubbleSort bl = new BubbleSort();
		int[] array = {20,5,8,10,25,46,12,17,5,9};
		bl.setA(array);
		bl.bubblesort(0, array.length-1);
		System.out.println(bl);
	}

}
