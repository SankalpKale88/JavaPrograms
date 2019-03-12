package calculateTax;

public class TaxRules {

	public static int getTax(int salary){
		if(salary<150000){
			return 0;
		}else if(salary > 150000 && salary < 500000){
			return 10;
		}else if(salary > 500000 && salary < 800000){
			return 20;
		}else if(salary > 800000){
			return 30;
		}
		return 0;
	}
}
