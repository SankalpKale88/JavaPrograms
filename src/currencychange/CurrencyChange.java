package currencychange;

public class CurrencyChange {
	
	public static void main(String[] args) {
		
		CurrencyChange c = new CurrencyChange();
		boolean isPossible = c.isChangePossible(16);
		System.out.println(isPossible);
	}
	
	public boolean isChangePossible(int amount){
		boolean changePossible = false;
		if(amount %3 ==0 || amount % 5==0){
			return true;
		}else{
			while(amount >= 1) {
				amount = amount -5;
				if(amount %3 ==0 || amount % 5 ==0){
					changePossible = true;
					break;
				}
			}
		}
		return changePossible;
	}
}
