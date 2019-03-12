import java.io.IOException;
import java.util.Scanner;


public class PrimeNumber {

	public static void main(String[] args) throws IOException {
		System.out.println("Enter the number of prime numbers");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int count = 0;
		for (int i = 1; i < n; i++) {
			if(i<4){
				count ++;
				System.out.println("Prime Numebr is :" +i);
			}else if(i%2 !=0 && i%3!=0 && i%4 !=0 && i%5!=0 && i%7!=0 ){
				System.out.println("Prime Number is: "+i);
				count++;
			}
		}
		
		int c = 0;
		for(int j = 1; j < n ;j ++){
			if(isPrime(j)){
				c++;
			}
		}
		System.out.println(c);
	}
	
	static boolean isPrime(int n) {
	    //check if n is a multiple of 2
	    if (n%2==0) return false;
	    //if not, then just check the odds
	    for(int i=3;i*i<=n;i+=2) {
	        if(n%i==0)
	            return false;
	    }
	    return true;
	}
	
}
