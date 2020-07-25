package merge;

import java.util.Arrays;

public class MergeSort {

	/**
	 * @param args
	 */
	public int[]a;
	public int[] getA() {
		return a;
	}
	public void setA(int[] a) {
		this.a = a;
	}
	public void mergeSort(int low, int high ){
		int middle =(low+high)/2;
		if(low<high){
			mergeSort(low,middle);
			mergeSort(middle+1,high);
			merge(low,high);
		}
		
	}
	
	public void merge(int low, int high){
		int[] helpers=Arrays.copyOf(a,a.length);
		for(int i=low;i<=high;i++){
			helpers[i]=a[i];
		}
		int middle=(low+high)/2;
		int i=low;
		int j=middle+1;
		int k=low;
		while(i<=middle&&j<=high){
			if(helpers[i]<=helpers[j]){
				a[k]=helpers[i];
				i++;
			}else{
				a[k]=helpers[j];
				j++;
			}
			k++;
		}
		while(i<=middle){
			a[k]=helpers[i];
			i++;
			k++;
		}
		while(j<=high){
			a[k]=helpers[j];
			j++;
			k++;
		}
		
	}
	
	@Override
	public String toString(){
		return Arrays.toString(a);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MergeSort mg = new MergeSort();
		int[] array = {3,5,8,10,25,46,12,17,5,9};
		mg.setA(array);
		mg.mergeSort(0, array.length-1);
		System.out.println(mg);
	}

}
