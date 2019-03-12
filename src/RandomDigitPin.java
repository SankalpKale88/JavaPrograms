import java.util.HashSet;
import java.util.Random;
import java.util.Set;


public class RandomDigitPin {
	 public static void main(String[] args) {
		
		 Random rd = new Random();
		 int randomKey =0;
		 Set duplicate  = new HashSet<>();
		 while(randomKey !=0){
			 int a = rd.nextInt(10000);
			 if(!duplicate.contains(a)){
				 duplicate.add(a);
				 randomKey=a;
			 }			 
		 }
		 
		 System.out.println(randomKey);
		 
		 
	}
}
