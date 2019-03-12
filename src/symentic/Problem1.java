package symentic;

import java.util.Arrays;
import java.util.Scanner;

public class Problem1 {
	public static void main(String[] args) {
		 Scanner in = new Scanner(System.in);
	        int res;
	        
	        int _a_size = Integer.parseInt(in.nextLine());
	        int[] _a = new int[_a_size];
	        int _a_item;
	        for(int _a_i = 0; _a_i < _a_size; _a_i++) {
	            _a_item = Integer.parseInt(in.nextLine());
	            _a[_a_i] = _a_item;
	        }
	        
	        int _N;
	        _N = Integer.parseInt(in.nextLine());
	        
	        res = isSumPossible(_a, _N);
	        System.out.println(res);
	}
	
	static int isSumPossible(int[] a, int N) {
		
		Arrays.sort(a);
		boolean sumPossible  = false;
		for(int i = 0; i < a.length ; i ++){
			for(int j=i+1; j< a.length ; j++){
				if(a[i] + a[j] == N){
					sumPossible = true;
					break;
				}else if(a[i] + a[j] >N){
					break;
				}
			}
			
		}
		if(sumPossible){
			return 1;
		}
		return 0;


    }
}
