import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class FactorsOfNumber {

	public static void main(String[] args) {
		
		System.out.println("Factors of number");
		List<Integer> a = findFactors(21);
		for (Integer a1 : a) {
			System.out.println(a1);
		}
	}
	
	public static List<Integer> findFactors(int num){
		List<Integer> a = new ArrayList<Integer>();
		int incrementor = 1;
		if(num %2 != 0){
			incrementor =2;
		}
		
		for (int i = 1; i <=num/2; i=i+incrementor) {
			if(num%i==0){
				a.add(i);
			}
		}
		a.add(num);
		return a;
	}
}
