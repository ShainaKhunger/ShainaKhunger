package testing;

import java.util.ArrayList;
import java.util.HashSet;

public class Collections {

	public static void main(String[] args) {
		
		HashSet<Integer> hset= new HashSet<Integer>();
		
		hset.add(45);
		hset.add(78);
		hset.add(90);
		hset.add(56);
		
		System.out.println("HashSet " +hset);
		
		
		//HashSet to Array Conversion
		
		Integer[] arr= new Integer[hset.size()];
		hset.toArray(arr);
		
		//Traversing of Array Elements
		
		System.out.println("Array Elements");
		for(Integer temp:arr)
		System.out.println(temp);
		
		ArrayList<Integer> list =new ArrayList<Integer>(hset);
		System.out.println(list);
	}

}
