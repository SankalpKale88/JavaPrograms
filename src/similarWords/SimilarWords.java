package similarWords;

import java.util.ArrayList;
import java.util.regex.Pattern;

public class SimilarWords {

		
		ArrayList<String> al=new ArrayList<String>();
		ArrayList <String>matches=new ArrayList<String>();
		public void insertChar()
		{
			al.add("cat");
			al.add("tac");
			al.add("tas");
			al.add("act");
			al.add("bct");
			al.add("bat");
			al.add("cats");
			al.add("at");
		}
		public void matchAll(String str)
		{
			Pattern p=Pattern.compile(str);
			for(String s:al)
			{
				if(p.matcher(s).matches())
				{
					matches.add(s);
				}
			}
			
			System.out.println(matches);
		}
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			SimilarWords match=new SimilarWords();
			match.insertChar();
			String str="[cat]+";
			match.matchAll(str);
	  }

}
