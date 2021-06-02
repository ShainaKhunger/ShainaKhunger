package secondAssignment;

import java.util.Scanner;

public class PositiveNegative {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*int num = -143;
		
		if (num>0)
			{
				System.out.println("The number is positive");
			}
		else if (num<0)
			{
				System.out.println("The number is negative");
			}
		else
		{
			System.out.println("The number is zero");
		}*/
		
		int number;
		
		Scanner scan = new Scanner (System.in);
		System.out.println("Enter the number you want to check: ");
		number = scan.nextInt();
		scan.close();
		
		if (number>0)
		{
			System.out.println("The number is positive");
		}
		else if (number<0)
		{
			System.out.println("The number is negative");
		}
		else 
		{
			System.out.println("The number is zero");
		}
		

	}

}
