package sorting;

public class MergeSort {

	public static void main(String[] args) {
		int array[] = new int[]{12,9,4,99,120,1,3,10,13};
		
		int i=0;
		int n=array.length;
		
		MergeSort srt = new MergeSort();
		srt.mergeSort(array, i, n-1);
		System.out.println("Sorted array");
		for (int j = 0; j < array.length; j++) {
			System.out.println(array[j] + " ");
		}
	}
	
	public void mergeSort(int a[],int low, int high){
		
		int i=low;
		int j = high;
		

		for(int k=low; k <= high ; k++){
			System.out.print(a[k]+ " ");
		}
		System.out.println();
		
		if(i >= j){
			return;
		}
		
		int middle = (i+j)/2;
		System.out.println("middle" + middle);
		mergeSort(a, i, middle);
		mergeSort(a, middle+1, j);
		
		
		int end_low = middle;
		int start_high=middle+1;
		System.out.println("end_low" + end_low);
		System.out.println("start_high" + start_high);
		while((i <= end_low) && (start_high <= j)){
			if(a[i] < a[start_high]){
				System.out.println("i is :"+i);
				i ++;
			}else{
				int temp = a[start_high];
				for(int k = start_high-1;k >= i;k--){
					//shifting the a[start_high]
					a[k+1]=a[k];
					System.out.println("a[k+1] is :"+a[k+1]);
				}
				a[i]=temp;
				System.out.println("a[i] is :"+a[i]);
				i++;
				end_low++;
				start_high++;
			}
		}
	}
}
