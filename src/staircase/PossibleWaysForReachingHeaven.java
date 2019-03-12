package staircase;

public class PossibleWaysForReachingHeaven {
	
	public static void main(String[] args) {
		
		int number = 3;
		PossibleWaysForReachingHeaven ways = new PossibleWaysForReachingHeaven();
		System.out.println(ways.stairCaseWay(number));
	}
	
	public long stairCaseWay(int number){
		if(number == 1 || number ==2 || number==3 ){
			return number;
		}
		return  stairCaseWay(number-1)+stairCaseWay(number-2)+stairCaseWay(number-3);
		
	}
}