package listAsgmt_Collections;

import java.util.HashSet;

public class HashSet_Comparison {

	public static void main(String[] args) {

		HashSet<String> festivals = new HashSet<String>();
		
		festivals.add("Lohri");
		festivals.add("Holi");
		festivals.add("Diwali");
		festivals.add("Chirsmas");
		festivals.add("Dussehra");
		festivals.add("Halloween");
		
		System.out.println("First HashSet: " +festivals);
		
		HashSet<String> festival1 = new HashSet<String>();
		
		festival1.add("Good Friday");
		festival1.add("Holi");
		festival1.add("Diwali");
		festival1.add("Chirsmas");
		festival1.add("Easter Day");
		festival1.add("Halloween");
		
		System.out.println("Second HashSet: " +festival1);
		
		//Comparison of both the sets
		
		boolean value = festivals.equals(festival1);
		
		System.out.println("Are both the sets same:- " +value);
		
		
	}

}
