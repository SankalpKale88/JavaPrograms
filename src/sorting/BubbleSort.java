package sorting;

public class BubbleSort {

	public static void main(String[] args) {
		int array[] = new int[]{4,5,2,1,77,12,3,66};
		System.out.println("Bubble Sort");
		System.out.println("Bubble sort , checks each element");
		System.out.println("Suppose we have array A[]");
		System.out.println("checks A[0] > A[1], if yes swap A[0] and A[1]");
		System.out.println("then checks A[1] and A[2] and swap if A[1] >A[2]");
		System.out.println("continues till A[n-1]>A[n]");
		System.out.println("sanky" + 6%10);
		for (int i = 0; i < array.length; i++) {
			for (int j = 1; j < (array.length-i); j++) {
				if(array[j-1] > array[j]){
					int tmp =array[j-1];
					array[j-1]=array[j];
					array[j]=tmp;
				}
			}
		}
		
		System.out.println("Sorted array");
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]+" ");
			
		}
	}
}
