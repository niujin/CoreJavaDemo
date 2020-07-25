package selection;

import java.util.Arrays;

public class SeleSort {

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
	
	public void selesort(int low, int high){
		int i,j,k;
		for(i=low;i<high;i++){
			k=i;
			for(j=i+1;j<=high;j++){
				if(a[j]<a[k]){
					k=j;
				}
			}
			if(a[k]<a[i]){
				exchange(i,k);
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
		return "SeleSort [a=" + Arrays.toString(a) + "]";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SeleSort sl = new SeleSort();
		int[] array = {20,5,8,10,25,46,12,17,5,9};
		sl.setA(array);
		sl.selesort(0, array.length-1);
		System.out.println(sl);
	}

}
