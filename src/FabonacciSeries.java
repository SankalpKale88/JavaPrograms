import java.util.Scanner;


public class FabonacciSeries {
public static void main(String[] args) {
	System.out.println("Enter the number of fabinacci series you want:");
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	
	int a =0;
	int b=1;

	for (int i = 0; i < n; i++) {
		System.out.println(a);
		b=a+b;
		a=b-a;
		
	}
	
	
}
	}
