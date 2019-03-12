package ratsrace;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.StringTokenizer;

public class RatsRace {
	 public static void main(String[] args) {
	        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
		 
		 
		 Scanner scanner = new Scanner(System.in);
		 int numberOfRats = Integer.parseInt(scanner.nextLine());
		 
		 String speedLine = scanner.nextLine();
		 
		 double speed[] = new double[numberOfRats];
		 
		 StringTokenizer st = new StringTokenizer(speedLine);
		 int i=0;
		 while(st.hasMoreTokens()){
			 speed[i] = Integer.parseInt(st.nextToken());
			 i++;
		 }
		 
		 String distanceLine = scanner.nextLine();
		 
		 double distance[] = new double[numberOfRats];
		 StringTokenizer st1 = new StringTokenizer(distanceLine);
		 int j=0;
		 while(st1.hasMoreTokens()){
			 distance[j] = Integer.parseInt(st1.nextToken());
			 j++;
		 }
		Map<Double,List<Integer>> timePerRank = new HashMap<Double, List<Integer>>();
		for(int k = 0; k < numberOfRats ; k ++){
			double key = (distance[k]/speed[k]);
			if(timePerRank.containsKey(key)){
				List<Integer> winners = timePerRank.get(key);
				winners.add(k+1);
				timePerRank.put(key, winners);
			}else{
				List<Integer> winners = new ArrayList<Integer>();
				winners.add(k+1);
				timePerRank.put(key, winners);
			}
		}
	  	
		Set<Double> keySet = timePerRank.keySet();
		List<Double> list = new ArrayList<Double>(keySet);
	
		Collections.sort(list);

		List<Integer> finalWinners = timePerRank.get(list.get(0));
		for (Integer win : finalWinners) {
			System.out.println(win);
		}
		 
	 }
}
