package quick;

import java.util.Arrays;

public class QuickSort {

	/**
	 * @param args
	 */
	private int[] a;
	
	public int[] getA() {
		return a;
	}

	public void setA(int[] a) {
		this.a = a;
	}
	
	
	@Override
	public String toString() {
		return "QuickSort [a=" + Arrays.toString(a) + "]";
	}

	public void quicksort(int low, int high){
		int middle = low+ (high-low)/2;
		int pivot=a[middle];
		int i=low;
		int j=high;
		while(i<j){
			while(a[i]<pivot){
				i++;
			}
			while(a[j]>pivot){
				j--;
			}
			if(i<=j){
				exchange(i,j);
				i++;
				j--;
			}
			
		}
		if(j>low){
			quicksort(low,j);
		}
		if(i<high){
			quicksort(i,high);
		}

	}
	
	public void exchange(int i, int j){
		int m =a[i];
		a[i]=a[j];
		a[j]=m;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		QuickSort qk = new QuickSort();
		int[] array = {20,5,8,10,25,46,12,17,5,9};
		qk.setA(array);
		qk.quicksort(0, array.length-1);
		System.out.println(qk);
	}

}
