package listAsgmt_Collections;

import java.util.ArrayList;
import java.util.HashSet;


public class HashSet1 {

	public static void main(String[] args) {

		
		HashSet<Integer> hset = new HashSet<Integer>();
		
		hset.add(34);
		hset.add(78);
		hset.add(86);
		hset.add(70);
		hset.add(10);
		
		System.out.println("Hashset Elements are: " +hset);
		
		// Creating an Array
		
		Integer[] arr = new Integer[hset.size()];
		hset.toArray(arr);
		
		//Display Elements
		
		System.out.println("Array Elements are:" );
		for (Integer temp: arr)
			System.out.println(temp);
		
		
		// Creating an ArrayList
		
		ArrayList<Integer> al = new ArrayList<Integer>(hset);
		
		System.out.println("ArrayList Elements:" +al);
		
		
			
	}

}
