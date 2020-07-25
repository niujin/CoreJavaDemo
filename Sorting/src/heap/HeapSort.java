package heap;

import java.util.Arrays;

public class HeapSort {

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
	
	public void heapsort(int low, int high){
		int index = getParent(high);
		
		for(int i=index;i>=low;i--){
			heapmaxify(a.length,i);
		}
	}
	
	public void heapmaxify(int heapsize, int index){
		int largest =index;
		int left = getLeft(index);
		int right = getRight(index);
		if(left<heapsize&&a[left]>a[largest]){
			largest=left;
		}
		if(right<heapsize&&a[right]>a[largest]){
			largest=right;
		}
		if(largest!=index){
			exchange(largest,index);
			heapmaxify(heapsize,largest);
		}
	}
	
	public void sort(int low, int high){
		for(int i=high;i>low;i--){
			exchange(0,i);
			heapmaxify(i,0);
		}
		
	}
	
	public int getParent(int index){
		return (index-1)>>1;
	}
	
	public int getLeft(int index){
		return (index << 1)+1;
	}
	
	public int getRight(int index){
		return (index<<1) +2;
	}
	
	public void exchange(int i, int j){
		int m =a[i];
		a[i]=a[j];
		a[j]=m;
	}
	
	@Override
	public String toString() {
		return "HeapSort [a=" + Arrays.toString(a) + "]";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HeapSort hp = new HeapSort();
		int[] array = {13,25,24,45,10,60,29,50};
		hp.setA(array);
		hp.heapsort(0, array.length-1);
		hp.sort(0, array.length-1);
		System.out.println(hp);
	}

}
