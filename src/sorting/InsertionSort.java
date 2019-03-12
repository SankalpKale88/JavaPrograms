package sorting;

/*Insertion sort is a comparison sort algorithm which works 
 * similar to the way we arrange the cards in a hand.
 *  We take one element at a time, starts compare from one end and them place  
 *  them in between the card lesser and greater than it.
 * 
 */
public class InsertionSort {
public static void main(String[] args) {
	int array[] = new int[]{4,1,5,3,88,12,34,4,6};
	System.out.println("doing insertion sort");
	System.out.println("Insertion sort takes element and checks with previos element");
	
	for (int i = 1; i < array.length; i++) {
		int j=i;
		int key=array[i];
		while ((j>0 && array[j-1]>key)) {
			array[j]=array[j-1];
			j--;			
		}
		array[j]=key;
	}
	
	System.out.println("Sorted array:");
	for (int j = 0; j < array.length; j++) {
		System.out.println(array[j]+" ");
	}
}
}
