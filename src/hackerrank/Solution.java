package hackerrank;

import java.io.*;
import java.math.BigDecimal;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    	 Scanner scanner = new Scanner(System.in);
		 int countOfNumbers = Integer.parseInt(scanner.nextLine());
		 String numbers = scanner.nextLine();
		 int i = 0;
		 int a[] = new int[countOfNumbers];
		 StringTokenizer st = new StringTokenizer(numbers);
			while(st.hasMoreTokens()){
				a[i] = Integer.parseInt(st.nextToken());
				i++;
			}
		calculateFractionOfTypeOfNumbers(a);
    }
    
    private static void calculateFractionOfTypeOfNumbers(int a[]){
    	double size = a.length;
    	double countOfZeros = 0.0;
    	double countOfPositive = 0.0;
    	double countOfNegative = 0.0;
    	
    	for(int i = 0 ; i < a.length; i ++){
    		if(a[i] > 0){
    			countOfPositive++;
    		}else if(a[i] < 0 ){
    			countOfNegative ++;
    		}else{
    			countOfZeros++;
    		}
    	}
    	
    	Double d1 = new Double(countOfPositive/size);
    	BigDecimal b1 = new BigDecimal(d1).setScale(6,BigDecimal.ROUND_HALF_UP);
    	
    	Double d2 = new Double(countOfNegative/size);
    	BigDecimal b2 = new BigDecimal(d2).setScale(6,BigDecimal.ROUND_HALF_UP);
    	
    	Double d3 = new Double(countOfZeros/size);
    	BigDecimal b3 = new BigDecimal(d3).setScale(6,BigDecimal.ROUND_HALF_UP);
    	
    	System.out.println(b1.toString());
    	System.out.println(b2.toString());
    	System.out.println(b3.toString());
    }
}