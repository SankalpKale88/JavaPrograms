package ap;

import java.util.Scanner;
import java.util.StringTokenizer;

public class ArithmeticProgress {
	
	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
		 int numbers = Integer.parseInt(scanner.nextLine());
		 
		 String allnumbers = scanner.nextLine();
		 
		 int indnumber[] = new int[numbers];
		 
		 
		 
		 StringTokenizer st = new StringTokenizer(allnumbers);
		 int i=0;
		 while(st.hasMoreTokens()){
			 indnumber[i] = Integer.parseInt(st.nextToken());
			 i++;
		 }
		 
		 int d = indnumber[1]-indnumber[0];
		 
		 for(int j =1; j < numbers ; j ++ ){
			 if(d == indnumber[j+1] - indnumber[j]){
				 break;
			 }else if((indnumber[j+2]-indnumber[j]) == (indnumber[j+1] - indnumber[j]) ){
				 d = indnumber[j+2]-indnumber[j];
				 break;
			 }else{
				 d = indnumber[1]-indnumber[0];
				 break;
			 }
		 }
		 
		 int sum = 0;
		 for (int j : indnumber) {
			sum = sum+j;
		}
		 
		int formulaSum = ((numbers+1)/2)*(2*indnumber[0]+(numbers*d));
		
		int missingNumber = formulaSum - sum;
		
		System.out.println(missingNumber);
	}
	
}
