package secondAssignment;

import java.util.Scanner;

public class DivisibleNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int number;
		
		Scanner scan = new Scanner (System.in);
		System.out.println("Enter the number");
		
		number = scan.nextInt();
		scan.close();
		
		if ((number % 5 == 0) && (number % 11 == 0))
		{
			System.out.println("The number is divisible by 5 and 11");
		}
		else
		{
			System.out.println("The number is not divisible by 5 and 11");
		}
			
		
	}

}
