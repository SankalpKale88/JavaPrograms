package sorting;

public class QuickSort {

	public static void main(String[] args) {
		int array[] = new int[]{12,9,4,99,120,1,3,10,13};
		
		int i=0;
		int n=array.length;
		
		QuickSort srt = new QuickSort();
		srt.quickSort(array, i, n-1);
		System.out.println("Sorted array");
		for (int j = 0; j < array.length; j++) {
			System.out.println(array[j] + " ");
		}
				
	}
	
	public void quickSort(int a[],int low,int high){
		
		for(int k=low; k <= high ; k++){
			System.out.print(a[k]+ " ");
		}
		System.out.println();
		if(low>=high){
			return;
		}
		int i=low;
		int j=high;
		int pivot=a[(i+j)/2]; //middlw element
		System.out.println("pivot:"+pivot);
		
		while(i<j){
			//moving up less than pivot value
			while(i<j && a[i] < pivot){
				i++;
				System.out.println("i is "+i);
			}
			
			
			//moving down greater than pivot
			while(i<j && a[j]> pivot){
				j--;
				System.out.println("j is "+j);
			}
			
			if(i<j){
				int temp = a[i];
				a[i]=a[j];
				a[j]=temp;
				
				
			}
		}
		if(j<i){
			int temp=j;
			j=i;
			i=temp;
		}
		
		quickSort(a,low,i);
		quickSort(a, i==low?i+1:i, high);
		
	}
}
