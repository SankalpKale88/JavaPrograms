package factors;

public class FactorsOfNumber {
	
	public static void main(String[] args) {
		
		int number = 12;
		
		int n = 6;
		
		int x = n >> 1;
		
		int y = n << 2;
		
		System.out.println(x);
		System.out.println(y);
		FactorsOfNumber fact = new FactorsOfNumber();
		System.out.println(fact.isAFactor(number, n));
		
		int z = 12 & 11 ;

		System.out.println(z);

		
	}
	
	public boolean isAFactor(int number,int n){
		if((12 & 5) == 0){
			return true;
		}
		return false;
	}
}

