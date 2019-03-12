import java.io.IOException;
import java.util.Scanner;


public class FabonacciSeriesUsingRecurrsion {
	public static void main(String[] args) throws IOException {
		System.out.println("Enter the number of fabonacci series");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		FabonacciSeriesUsingRecurrsion fabonacciSeries  =new FabonacciSeriesUsingRecurrsion();
		for (int i = 0; i < n; i++) {
			System.out.println(" " + fabonacciSeries.fab(i));
		}
	}
	
	public int fab(int n){
		if(n==0 || n==1){
			return n;
		}else{
			return(fab(n-1)+fab(n-2));
		}
	}
}
