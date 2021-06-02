package secondAssignment;

import java.util.Scanner;

public class DaysInMonth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int month;
		Scanner scan= new Scanner(System.in);
		
		System.out.println("Enter the Month Number between 1 to 12");
		
		month = scan.nextInt();
		
		scan.close();
		
		if(month == 1 || month == 3 || month == 5 || month == 7|| month == 8|| month == 10|| month ==12)
		{
			System.out.println("31 Days in this month");
		}
		else if (month == 4 || month == 6 || month == 9 || month == 11)
		{
			System.out.println("30 Days in this month");
		}
		else if (month == 2)
		{
			System.out.println("Either 28 or 29 days in this month");
		}
		else
		{
			System.out.println("Please Enter the valid Month number between 1 to 12");
		}
		

	}

}
