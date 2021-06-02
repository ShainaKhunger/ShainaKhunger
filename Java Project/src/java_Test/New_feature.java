package java_Test;

import java.util.HashSet;

public class New_feature {

	public static void main(String[] args) {
		
		HashSet<Integer> hset = new HashSet<Integer>();
		
		hset.add(34);
		hset.add(78);
		hset.add(86);
		hset.add(70);
		hset.add(10);
		
		System.out.println("Hashset Elements are: " +hset);
		
		for(Integer temp: hset)
		{
			System.out.println(temp);
		}

	}

}
