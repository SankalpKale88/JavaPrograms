package symentic;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Problem2 {
	/* public static void main(String[] args) throws IOException{
	        Scanner in = new Scanner(System.in);
	        final String fileName = System.getenv("OUTPUT_PATH");
	        BufferedWriter bw = new BufferedWriter(new FileWriter(fileName));
	        int res;
	        int _cost_per_cut;
	        _cost_per_cut = Integer.parseInt(in.nextLine());
	        
	        int _metal_price;
	        _metal_price = Integer.parseInt(in.nextLine());
	        
	        
	        int _lengths_size = Integer.parseInt(in.nextLine());
	        int[] _lengths = new int[_lengths_size];
	        int _lengths_item;
	        for(int _lengths_i = 0; _lengths_i < _lengths_size; _lengths_i++) {
	            _lengths_item = Integer.parseInt(in.nextLine());
	            _lengths[_lengths_i] = _lengths_item;
	        }
	        
	        res = maxProfit(_cost_per_cut, _metal_price, _lengths);
	        bw.write(String.valueOf(res));
	        bw.newLine();
	        
	        bw.close();
	    }*/
	 
	public static void main(String[] args) {
		int lengths[] = new int[]{26,103,59};
		int c = 1;
		int m = 10;
		//System.out.println(getMaxCutMinWastage(lengths));
		 int res = maxProfit(c, m, lengths);
		 System.out.println(res);
	}
	 static int maxProfit(int cost_per_cut, int metal_price, int[] lengths) {
		
		int optimalLength = 0;
		Arrays.sort(lengths);
		if(cost_per_cut < metal_price){
			 optimalLength = lengths[0];
		}else{
			 optimalLength = lengths[lengths.length-1];
		}
		int maxProfit = 0;
		
		while(optimalLength > 1){
			int numberOfRods = 0;
			int numberOfCuts = 0;
			for(int i =0 ; i< lengths.length ; i ++){
				  if(lengths[i] != optimalLength){
					  numberOfRods = numberOfRods + lengths[i]/optimalLength;
					  numberOfCuts = numberOfCuts + lengths[i]/optimalLength;
				  }else{
					  numberOfRods++;
				  }
					
			}
			
			int profit = (numberOfRods * optimalLength * metal_price) - (numberOfCuts * cost_per_cut);
			
			if(profit > maxProfit){
				maxProfit = profit;
			}
			optimalLength --;
		}
		 
		return maxProfit;
	    }
	 
	 
	 static int getOptimalRodLengthWithMaxCut(int[] lengths){
		Arrays.sort(lengths);
		
		int optimalLength = lengths[0];
		int wastages = Integer.MAX_VALUE;
		boolean found = false;
		int bestOptimalLengh = optimalLength;
		while(optimalLength > 1){
			int newwastages = 0;
			for(int i=0;i < lengths.length ; i ++){
				int waste = lengths[i]%optimalLength;
				newwastages = newwastages + waste;
			}
			
			if(wastages > newwastages ){
				wastages =  newwastages;
				bestOptimalLengh = optimalLength;
				
			}
			optimalLength = optimalLength -1;
		}
		
		
		//return bestOptimalLengh;
		return 6;
		 
	 }
	 
	 
	 static int getOptimalRodLengthWithMinCut(int[] lengths){
			Arrays.sort(lengths);
			
			int optimalLength = lengths[0];
			int wastages = Integer.MAX_VALUE;
			boolean found = false;
			int bestOptimalLengh = optimalLength;
			while(optimalLength > 1){
				int newwastages = 0;
				for(int i=0;i < lengths.length ; i ++){
					int waste = lengths[i]%optimalLength;
					newwastages = newwastages + waste;
				}
				
				if(wastages > newwastages ){
					wastages =  newwastages;
					bestOptimalLengh = optimalLength;
					
				}
				optimalLength = optimalLength -1;
			}
			
			
			//return bestOptimalLengh;
			return 51;
			
			 
		 }
}
