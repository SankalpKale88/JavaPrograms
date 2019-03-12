package sorting;

/*
 * Selection sort is a comparison sort with O(n2) timing complexity 
 * making in-efficient on large sets. 
 * In this algorithm the element on active position (say ith position) is compared
 *  with other positions (say i+1th to nth position) 
 * and swaps if it’s larger than the compared element.
 */
public class SelectionSort {
	
	public static void main(String[] args) {
		int[] array = new int[]{5, 6 ,7,8 ,23 ,3, 6, 7,8 };
		int j;
		int tmp=0;
		System.out.println("Selection sort checks min element in the array and" +
				"replaces the index position of the minimum and the key");
		for (int i = 0; i < array.length; i++) {
			j=i;
			for (int k = i; k < array.length; k++) {
				if(array[j] > array[k]){
					//smallest index
					j=k;
				}
			}
			tmp = array[i];
			array[i]=array[j];
			array[j]=tmp;
		}
		
		System.out.println("Sorted array using selection sort");
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i] +" ");
		}
	}
	
	

}
