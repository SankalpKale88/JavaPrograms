
public class ReverseOfAnArray {
	public static void main(String[] args) {
		
		int b[] = new int[]{1,3,4,5,6};
		int a[] = reverseOfArray(b);
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}
	
	public static int[] reverseOfArray(int a[]){
		int n = a.length-1;
		for (int i = 0; i < a.length/2; i++) {
			int temp = a[i];
			a[i] = a[n];
			a[n] = temp;
			n--;
		}
		
		return a;
	}
	
}
