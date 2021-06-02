package list_Interface;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Array_List {

	public static void main(String[] args) {
		
		
		ArrayList<Integer> ar = new ArrayList<Integer>();
		
		ar.add(43);
		ar.add(86);
		ar.add(45);
		ar.add(75);
		ar.add(43);
		
		System.out.println(ar.size());
		System.out.println("******");
		
		//Traverse all the elements
		
		Iterator<Integer> it = ar.iterator();
		
		while(it.hasNext()) 
		{
			System.out.println(it.next());
			
		}
		
		// Convert ArrayList to Set // No duplicate value // that's y just print 43 single time
		
		Set <Integer> set1 = new HashSet<Integer>(ar);
		System.out.println(set1);
	}

}
