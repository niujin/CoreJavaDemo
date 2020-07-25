package binary;

import java.util.Arrays;

public class BinarySearch {

	/**
	 * @param args
	 */
	public static int bsearch(int[] a, int target){
		int low =0;
		int high= a.length-1;
		while(low<high){
			int middle=(low+high)/2;
			if(a[middle]==target){
				return middle;
			}else if(a[middle]<target){
				low=middle+1;
			}else{
				high=middle-1;
			}
		}
		if(target==a[low]){
			return low;
		}
		return -1;
			
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a ={13,25,24,45,10,60,29,50};
		Arrays.sort(a);
		for(int i=0;i<a.length;i++){
			System.out.println(a[i]);
		}
		System.out.println(bsearch(a,50));
	}

}
