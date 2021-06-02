package stringAssignment;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class UniqueCharacter {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the String");
		
		String input = sc.nextLine();
		
		if (isUnique(input))
		{
			System.out.println("All Characters of String are unique");
		}
		else
		{
			System.out.println("All Characters of String are not unique");
		}
		
		sc.close();

	}

	private static boolean isUnique(String input) {
		
		Set<Character> set = new HashSet<>();
		
		char[] characters = input.toCharArray();
		
		for (Character c : characters) 
		{ 
			if (!set.add(c)) 
			{ 
				return false; 
			}
			return true;
		}

		return false;
	}

}
