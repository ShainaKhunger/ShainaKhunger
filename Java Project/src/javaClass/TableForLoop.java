package javaClass;

public class TableForLoop {

	public static void main(String[] args) {
		
		// Print table of 8
		
		/*for (int i=1; i<=10; i++)
		{
			System.out.println(8*i);
		}
		
		// Array Traverse all Elements
		 * 
		int[] arr= {4,6,8,4,9};
		
		for(int num: arr)
		{
			System.out.println(num);
		}*/
		
		
		// Factorial
		
		int num = 5;
		long fact = 1;
		
		for (int i=1; i<=num; i++)
		{
			fact = fact*i;
		}
		System.out.println(fact);
	}

}
