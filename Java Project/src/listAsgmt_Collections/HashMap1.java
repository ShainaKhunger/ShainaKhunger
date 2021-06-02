package listAsgmt_Collections;

import java.util.HashMap;

public class HashMap1 {

	public static void main(String[] args) {
		
		HashMap<Integer, String> map1 = new HashMap<Integer, String>();
		
		map1.put(101, "Aryan");
		map1.put(102, "Zoya");
		map1.put(103, "Samar");
		map1.put(104, "Aarav");
		
		System.out.println("Count the Key-Values: " +map1.size());
		
		// Copy all the elements of map1 into map2
		
		HashMap<Integer, String> map2 = new HashMap<Integer, String>();
		map2.putAll(map1);
		
		
		System.out.println("Elements of Second HashMap: " +map2);
		
		//Check the map1 contains the value or not
		
		boolean search = map1.containsKey(103);
		if(search)
			System.out.println("Hash Map1 contains "+search+" key");
		else
			System.out.println("Hash Map1 does not contain "+search+" key");

		// Check from map2
		
		boolean search1 = map2.containsKey(108);
		if(search1)
			System.out.println("Hash Map2 contains "+search+" key");
		else
			System.out.println("Hash Map2 does not contain "+search+" key");
	}

}
