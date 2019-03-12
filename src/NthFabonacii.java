


public class NthFabonacii {

	public static void main(String[] args) {
		
		int nth = getNthFab(10);
		System.out.println(nth);
		
	}
	
	public static int getNthFab(int n){
		int a=0;
		int b=1;
		for (int i = 0; i < n-2; i++){
			b=a+b;
			a=b-a;
		}
		return b;
	}
}
