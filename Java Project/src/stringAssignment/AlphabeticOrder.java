package stringAssignment;

import java.util.Arrays;
import java.util.Scanner;

public class AlphabeticOrder {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	      System.out.println("Enter a string value: ");
	      String str = sc.nextLine();
	      sc.close();
	      
	      char charArray[] = str.toCharArray();
	      Arrays.sort(charArray);
	      System.out.println(new String(charArray));
	     

	}
	

}
