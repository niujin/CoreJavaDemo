package insert;

import java.util.Arrays;

public class InsertionSort {

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
	
	public void insertionsort(int low, int high){
		int i,j;
		for(i=low+1;i<=high;i++){
			int intrim=a[i];
			j=i-1;
			while(j>=low&&intrim<=a[j]){
				a[j+1]=a[j];
				j--;
			}
			a[j+1]=intrim;
		}
	}
	
	@Override
	public String toString() {
		return "SeleSort [a=" + Arrays.toString(a) + "]";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InsertionSort in = new InsertionSort();
		int[] array = {20,5,8,10,25,46,12,17,5,9};
		in.setA(array);
		in.insertionsort(0, array.length-1);
		System.out.println(in);
	}

}
