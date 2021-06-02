package javaClass;

public class DigitsofNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 1437643;
		int sum = 0;
		
		// 143 % 10 = 3 
		// 14 % 10 = 4
		// 1 % 10 = 1 
		
		while (n>0)
		{
			int temp= n%10;  //3
			
			System.out.println(temp);
			
			n = n/10;
			
			sum = sum+temp;
			 
		}
		
		System.out.println("Sum of the numbers is: " +sum);
	}

}
