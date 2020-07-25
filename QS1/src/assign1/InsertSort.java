package assign1;

public class InsertSort {
	public void sort(int a[]){
		int i,j,k;
		for(i=1;i<a.length;i++){
			k=a[i];
			for(j=i-1;j>=0;j--){
				if(k<=a[j]){
					a[j+1]=a[j];				
				}else{
					break;
				}
			}
			a[j+1]=k;
		}
	}
}
