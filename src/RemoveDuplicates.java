
public class RemoveDuplicates {

	public static void main(String[] args) {
		int[] a = new int[]{1,2,3,4,5,2,3,4,5,4,6,7};
		int end = a.length;
		for (int i = 0; i < end; i++) {
			for (int j = i+1; j < end; j++) {
				int shiftLeft=j;
				if(a[i] == a[j]){
					for (int k = j+1; k < end;k++,shiftLeft++) {
						a[shiftLeft]=a[k];
					}
					end--;
				}
				
			}
		}
		
		System.out.println("Unique Array");
		for (int i = 0; i < end; i++) {
			System.out.println(a[i]);
		}
	}
}
