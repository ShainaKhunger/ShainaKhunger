package list_Interface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayList_Bank {

	public static void main(String[] args) {

		ArrayList<String> bank = new ArrayList<String>();
		
		bank.add("HDFC");
		bank.add("SBI");
		bank.add("ICICI");
		bank.add("HSBC");
		bank.add("Reserve");
		bank.add("UKO");
		
		
		
		//Traverse all the elements
		
		Iterator<String> it = bank.iterator();
		while(it.hasNext()) 
		{
			System.out.println(it.next());
			
		}
		
		// change the name on First index value
		
		bank.add(0, "Canara");
		System.out.println(bank);
		
		// Retrieve the element
		
		System.out.println("The Element at index 1 in the ArrayList is: " + bank.get(1));
			
		//Update the element 
		
		bank.set(5, "BOI");
		System.out.println(bank);

		// Size of the ArrayList
		
		System.out.println(bank.size());
		
		// Ascending order
		
		Collections.sort(bank);
		System.out.println("Ascending Order\n" + bank);
		
		//Descending order
		
		Collections.sort(bank, Collections.reverseOrder());
		System.out.println("Descending Order\n" + bank);
		
		
		//Search the Element
		
		boolean search= bank.contains("HDFC");
		
		if(search)
			System.out.println("The List Contains HDFC Bank");
		else
			System.out.println("The List does not  Contains HDFC Bank");
		
		
		// Reverse the ArrayList
		
		System.out.println("Before Reverse:" +bank);
		
		Collections.reverse(bank);
		System.out.println("After Reverse:" +bank);
		
		// Swap the Elements
		
		System.out.println("Before Swap:" +bank);
		
		Collections.swap(bank, 3, 4);
		System.out.println("After Swap:" +bank);
	}
	 

}
