package listAsgmt_Collections;

import java.util.LinkedList;

public class LinkedList1 {

	public static void main(String[] args) {
		
		LinkedList<String> colors =new LinkedList<String>();
		
		colors.add("Purple");
		colors.add("Red");
		colors.add("Orange");
		colors.add("Green");
		
		System.out.println(colors);

		for(int i=0; i<colors.size(); i++)
		{
			System.out.println("Element at index "+i+" is- " +colors.get(i) );
		}
		
		// Check the element available in the list or not
		
		boolean search = colors.contains("Cherry");
		if(search)
			System.out.println("This color is available in the list");
		else
			System.out.println("This color is not available in the list");
	}

}
