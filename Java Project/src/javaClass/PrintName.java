package javaClass;

import java.util.Scanner;

public class PrintName {

	public static void main(String[] args) {
		
		//System.out.println("Hello");
		//System.out.println("Shaina");
		
		try (Scanner input = new Scanner(System.in)) {
			System.out.println("Enter the number between 0 to 1000");
			int num = input.nextInt();
			
			int once = num%10;
			num = num/10;
			int tens = num%10;
			num =num/10;
			int hundreds = num%10;
			num = num/10;
			int sum = once + tens+ hundreds;
			System.out.println(sum);
		}
		
		
		
		
		
		
	}

}
