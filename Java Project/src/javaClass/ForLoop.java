package javaClass;

public class ForLoop {

	public static void main(String[] args) {

		for (int i=1; i<=5; i++)
		{
			for (int j=1; j<=5; j++)
			{
		       System.out.println(i+ " " +j);
			}
			   System.out.println();
		}
		
		System.out.println("--------");
		
		for(int i=0; i<=5; i++)
		{
			//Print space between two stars
			for (int j= 2*(5-i); j>=0; j--)
			{
				System.out.print(" ");
			}
			
			//Inner loop for columns
			for (int j=0; j<=i; j++)
			{
				System.out.print("@ ");
			}
			
			System.out.println();
		}

	}

}
