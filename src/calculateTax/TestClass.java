/* IMPORTANT: Multiple classes and nested static classes are supported */

/*
 * uncomment this if you want to read input.
import java.io.BufferedReader;
import java.io.InputStreamReader;
*/

import java.io.*;
import java.time.LocalTime;
import java.util.*;

class TestClass {
    public static void main(String args[] ) throws Exception {
        /*
         * Read input from stdin and provide input before running

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        int N = Integer.parseInt(line);
        for (int i = 0; i < N; i++) {
            System.out.println("hello world");
        }
        */

        Scanner scanner = new Scanner(System.in);
		int arraySize = Integer.parseInt(scanner.nextLine());
		int a[] = new int[arraySize];
		int i = 0;
		 StringTokenizer st = new StringTokenizer(scanner.nextLine());
			while(st.hasMoreTokens()){
				a[i] = Integer.parseInt(st.nextToken());
				i++;
		}
		
		Integer result = subNonzeroArray(a);
		System.out.println(result);
    }
    
    
    private static Integer subNonzeroArray(int a[]){
    	int max = 0;
		List<Integer> ab = new ArrayList<Integer>();
    	int countOfLongSubArray = 0;
    	for (int i=0;i <a.length; i ++){
    		if(a[i] != 0){
    			ab.add(a[i]);
       		}
    		int size =ab.size();
    		if(size > max){
    			max = size;
    		}
    		ab = new ArrayList<Integer>(); 
    		size = 0;
    	}
    	return max;
    }
}
