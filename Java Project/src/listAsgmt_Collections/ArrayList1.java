package listAsgmt_Collections;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayList1 {

	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<String>();
		
		list.add("Java");
		list.add("Phython");
		list.add("C");
		list.add("C++");
		list.add("Ruby");
		
		
		System.out.println("Original Order:" +list);
		
		Collections.reverse(list);
		
		System.out.println("Reverse Order:" +list);
	}

}
