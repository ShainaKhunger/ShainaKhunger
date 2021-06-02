package list_Interface;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMap_Collection {

	public static void main(String[] args) {
		
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		
		hm.put(101, "Aryan");
		hm.put(102, "Zoya");
		hm.put(103, "Samar");
		hm.put(104, "Aarav");
		
		// Traversing a Map
		
		Set<Entry<Integer, String>> setKey = hm.entrySet();
		
		Iterator<Entry<Integer, String>> it= setKey.iterator();
		
		while(it.hasNext())
		{
			@SuppressWarnings("rawtypes")
			
			Map.Entry entry= (Map.Entry)it.next();
			System.out.println(entry.getKey() +" " +entry.getValue());
		}
		
		for(@SuppressWarnings("rawtypes") Map.Entry var : hm.entrySet())
		{
			System.out.println(var.getKey() +" " +var.getValue());
		}
		
				
	}

}
