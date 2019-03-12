package sorting;

public class HeapSort {

	public static void main(String[] args) {
		
	int array[] = new int[]{12,9,4,99,120,1,3,10,13};
		
		int i=0;
		int n=array.length;
		System.out.println("Lenght: " +n);
		HeapSort srt = new HeapSort();
		for(i=array.length;i>1;i--){
			srt.heapSort(array, i-1);
		}
		
		System.out.println("Sorted array");
		for (int j = 0; j < array.length; j++) {
			System.out.println(array[j] + " ");
		}

	}
	
	public void heapSort(int a[],int arr_ubound){
		
		for(int k=0; k < a.length;k++){
			System.out.print(" "+a[k]);
		}
		System.out.println();
		int i,j;
		int lchild,rchild,mchild,root,temp;
		
		root=(arr_ubound-1)/2;
		System.out.println("Root is "+ root);
		
		for(j=root;j>=0;j--){
			for(i=root;i>=0;i--){
				lchild=2*i+1;
				rchild=2*i+2;
				System.out.println("LCHILD:"+lchild+" RCHILD:"+rchild);
				if((lchild <= arr_ubound) && (rchild <= arr_ubound)){
					if(a[rchild] > a[lchild]){
						mchild = rchild;
					}else{
						mchild = lchild;
					}
				}else{
					if(rchild > arr_ubound){
						mchild = lchild;
					}else{
						mchild = rchild;
					}
				}
				
				if(a[i] < a[mchild]){
					temp=a[i];
					a[i]=a[mchild];
					a[mchild] = temp;
					
				}
			}
		}
		
		int tmp = a[0];
		a[0]=a[arr_ubound];
		a[arr_ubound]=tmp;
		return;
		
		
	}
}
