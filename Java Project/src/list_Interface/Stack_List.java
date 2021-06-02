package list_Interface;

import java.util.Iterator;
import java.util.Stack;

public class Stack_List {

	public static void main(String[] args) {

		Stack<String> list =new Stack<String>();			//also used <Integer>, <Boolean>
		
		list.add("Java");		//1
		list.add("C#"); 		//2	
		list.add("PHP");		//3
		list.add("Phython"); 	//4
		list.push("Angular"); 	//5
		list.push("C++");		//6
		list.push("JS");		//7
		list.pop();				//7-1=6
		
		System.out.println(list.size());
		
		//Traverse all the values
		
		Iterator<String> it = list.iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		System.out.println(list);
	}

}
