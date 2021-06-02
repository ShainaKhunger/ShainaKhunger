package exceptionalHandling;

import java.util.Scanner;


public class TryCatch {

	public static void main(String[] args) {
		//int x=1;
		
		//do {
		try {
				Scanner input = new Scanner(System.in); 
				
				System.out.println("Enter the first num: ");
				int n1 = input.nextInt();
				
				System.out.println("Enter the second num: ");
				int n2 = input.nextInt();
				
				int sum = n1/n2;
				System.out.println(sum);
				
				int n3 = Integer.parseInt("multiple catch");
				System.out.println(n3);
				
				//x=2;
				input.close();
			}
		
			
			  catch(ArithmeticException e) 
				{ 
				  System.out.println("You can't do this"); 
				}
			  catch (NumberFormatException e) 
				{
				  System.out.println("Number format exception"); 
				}
			 
		finally 
			{
				System.out.println("Print");
			}
		
	//} 
		//while(x == 1);
		

		
}
}


