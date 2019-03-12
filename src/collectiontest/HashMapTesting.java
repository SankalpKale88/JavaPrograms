package collectiontest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class HashMapTesting {

	public static void main(String[] args) {
		HashMap<Integer, String> map = new HashMap<>();
		map.put(new Integer(5), "A");
		map.put(new Integer(5), "B");
		
		System.out.println(map.size());
		HashMap<List<String>,String> mapList = new HashMap<>();
		
		List<String> aList = new ArrayList<String>();
		aList.add("1");
		aList.add("2");
		
		mapList.put(aList, "A");
		
		List<String> aList1 = new ArrayList<String>();
		aList1.add("1");
		aList1.add("2");
		
		mapList.put(aList1, "B");
		
	
		System.out.println(mapList.size());
	}
}
