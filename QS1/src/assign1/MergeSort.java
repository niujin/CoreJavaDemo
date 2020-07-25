package assign1;

public class MergeSort {
	private int values[];
	private int helpers[];
	private int number;
	public void sort(int a[])
	{
		this.values = a;
	    number = values.length;
	    this.helpers = new int[number];
	    mergesort(0, number - 1);
	}
	public void mergesort(int low, int high)
	{
		if (low < high) {
		      // Get the index of the element which is in the middle
		      int middle = low + (high - low) / 2;
		      // Sort the left side of the array
		      mergesort(low, middle);
		      // Sort the right side of the array
		      mergesort(middle + 1, high);
		      // Combine them both
		      merge(low, middle, high);
		}
	}
	public void merge(int low, int middle, int high)
	{
		for(int i=low;i<=high;i++){
			helpers[i]=values[i];
		}
		
		int i=low;
		int j=middle+1;
		int k=low;
		
		while(i<middle+1&&j<=high){
			if(helpers[i]<=helpers[j]){
				values[k]=helpers[i];
				i++;
			}else{
				values[k]=helpers[j];
				j++;
			}
			k++;
		}
		
		while (i <= middle) {
		      values[k] = helpers[i];
		      k++;
		      i++;
		    }
		while (j <= high) {
		      values[k] = helpers[j];
		      k++;
		      j++;
		    }
	}
}
