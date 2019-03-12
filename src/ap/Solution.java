package ap;

import java.io.*;
import java.time.LocalTime;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
         Scanner scanner = new Scanner(System.in);
		 int matrixSize = Integer.parseInt(scanner.nextLine());
		 scanner.next()
		 int a[][] = new int[matrixSize][matrixSize];
		int i =0;
        int j = 0;
        for(int m = 0 ; m < matrixSize ; m ++){
        	String row = scanner.nextLine();
			StringTokenizer st = new StringTokenizer(row);
			while(st.hasMoreTokens()){
				a[i][j] = Integer.parseInt(st.nextToken());
				j++;
			}
			i++;
			j=0;
		}
		 
          long diagonal1Sum = 0;
        long diagonal2Sum = 0;
         for(int k=0;k < matrixSize ; k ++){
             for(int l=0; l < matrixSize ; l++){
                 if(k == l){
                     diagonal1Sum = diagonal1Sum + a[k][l];
                 }
                 if(k+l == matrixSize -1 ){
                     diagonal2Sum = diagonal2Sum + a[k][l];
                 }
             }
         }
         
         long actualAbsDiff = Math.abs(diagonal1Sum - diagonal2Sum);
         System.out.println(actualAbsDiff);
        
    }
    
    private LocalTime getLocalTime(String time){
    	String[] split = time.split(":");
    	LocalTime t = LocalTime.of(Integer.parseInt(split[0]), Integer.parseInt(split[1]));
    }
}