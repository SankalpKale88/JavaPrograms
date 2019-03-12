import java.util.Scanner;


public class Factorial {

	public static void main(String[] args) {
		System.out.println("Enter the number to find factoria:");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Factorial factorial = new Factorial();
		int result = factorial.fact(n);
		System.out.println("Factorial is :" + result);
	}
	
	public int fact(int n){
		if(n==1){
			return 1;
		}else{
			return n * fact(n-1);
		}
	}
	
	
}
