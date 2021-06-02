package javaClass;

public class Addition {

	public static void main(String[] args) {
		
		int a = 10;
		int b = 20;
		int sum = a + b ;
		
		// Swap the values 
		
		a= a+b;
		b= a-b;
		a= a-b;
		
		System.out.println(a);
		System.out.println(b);
		
		System.out.println("Sum of number is:" +sum);

		int x = 100;
		int y = 12;
		int div = x/y;
		
		System.out.println("Division of number is:" +div);
		
		
	}
}
