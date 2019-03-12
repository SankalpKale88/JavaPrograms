package LeastCommonRecent;

import java.util.HashMap;
import java.util.LinkedList;

/**
 * Find out the least recent occurred message. 
Suppose your are getting message in streams, and you add it using add("M1"). 
You need to find out the least recent occurred message at any point of time. 
for example, 
Add("M1')->Add("M2') then LROM=M1 
Add("M1')->Add("M2')->Add("M1') then LROM =M2 
Add("M1')->Add("M2')->Add("M1')->Add("M3')-> then LROM =M2 
Hope question is clear.
 * @author Sankalp
 *
 */
public class LeastCommonRecentMessage {
	
	private HashMap<String,Integer> messageCount = new HashMap<String,Integer>();
	private LinkedList<String> messages = new LinkedList<String>();
	
	public static void main(String[] args) {
		LeastCommonRecentMessage lrm = new LeastCommonRecentMessage();
		lrm.add("M2");
		lrm.add("M1");
		
		System.out.println(lrm.leastCommonRecentMessage());
		
		LeastCommonRecentMessage lrm1 = new LeastCommonRecentMessage();
		lrm1.add("M3");
		lrm1.add("M1");
		lrm1.add("M2");
		lrm1.add("M1");
		
		System.out.println(lrm1.leastCommonRecentMessage());
	}
	
	public void add(String message){
		messages.add(message);
		if(messageCount.containsKey(message)){
			messageCount.put(message, messageCount.get(message)+1);
		}else{
			messageCount.put(message, 1);
		}
	}
	
	
	public String leastCommonRecentMessage(){
		String lrm = null;
		int leastOccurence = 1000;
		for (String message : messages) {
			int occurence = messageCount.get(message);
			if(leastOccurence >= occurence){
				leastOccurence = occurence;
				lrm  = message;
			}
		}
		
		return lrm;
	}
}
