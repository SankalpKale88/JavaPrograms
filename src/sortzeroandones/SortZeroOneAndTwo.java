package sortzeroandones;

public class SortZeroOneAndTwo {
	
	public static void main(String[] args) {

		Integer inputArray[] = new Integer[]{0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1};
		
	
		sortZeroOneAndTWo(inputArray,inputArray.length);
		
		for (Integer i : inputArray) {
			System.out.print(i +"\t");
		}
	}

	private static void sortZeroOneAndTWo(Integer[] inputArray, int length) {
		
		int low = 0;
		int mid = 0;
		int high = length-1;
		
		while(mid <= high){
			
			switch (inputArray[mid]) {
			case 0:
				int temp = inputArray[low];
				inputArray[low]=inputArray[mid];
				inputArray[mid]=temp;
				low++;
				mid++;
				break;
			case 1:
				mid++;
				break;
			case 2:
				int temp1 = inputArray[mid];
				inputArray[mid]=inputArray[high];
				inputArray[high]=temp1;
				high--;
				break;

			default:
				break;
			}
		}
	}
}
