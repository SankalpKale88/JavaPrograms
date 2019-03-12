package calculateTax;

import java.util.Scanner;

public class CalculateIncomeTax {

	public static void main(String[] args) {
		System.out.println("Enter your salary");
		Scanner sc = new Scanner(System.in);
		int sal = sc.nextInt();
		
		int tax = TaxRules.getTax(sal);
		
	 double totalTax = (sal * tax)/100;
	 System.out.println(totalTax);
	}
}
