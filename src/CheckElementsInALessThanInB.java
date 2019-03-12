
public class CheckElementsInALessThanInB {

	public static void main(String[] args) {
		int a[]=new int[]{1,2,3,4,5,6,7};
		int b[]=new int[]{11,12,12,34,56,55};
		
		int max=a[0];
		int min=b[0];
		
		for (int i = 0; i < a.length; i++) {
			if(max<a[i]){
				max=a[i];
			}
		}
		
		
		for (int i = 0; i < b.length; i++) {
			if(min > b[i]){
				min=b[i];
			}
		}
		
		System.out.println(max);
		System.out.println(min);
		if(max<min){
			System.out.println("All elements are less in array a");
		}
	}
}
