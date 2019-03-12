package stringreplace;

import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ReplaceNSubStrings {
	
	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
		 String inputString = scanner.nextLine();
		 
		 int numberOfSubStrings = Integer.parseInt(scanner.nextLine());
		 
		 String allSubStrings = scanner.nextLine();
		 
		 String[] subStringArray = new String[numberOfSubStrings];
		 
		 StringTokenizer st = new StringTokenizer(allSubStrings);
		 int i=0;
		 while(st.hasMoreTokens()){
			 subStringArray[i] = st.nextToken();
			 i++;
		 }
		 
		 Pattern[] patternArray = new Pattern[numberOfSubStrings];
		 
		 for (int j = 0; j < subStringArray.length; j++) {
			
			 Pattern p = Pattern.compile(subStringArray[j]);
			 patternArray[j] = p;
		}
		
		boolean found = true;
		
		while(found){
			int patternFound = 0;
			for (Pattern pattern : patternArray) {
				Matcher m = pattern.matcher(inputString);
				if(m.find()){
					patternFound ++;
					inputString = m.replaceAll("");
				}
			}
			
			if(patternFound == 0){
				found = false;
			}
		}
		
		System.out.println(inputString);
		System.out.println(inputString.length());
	}
}
