package javaClass;


public class SwapVariable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 24, b = 48;
		
		System.out.println("Before Swap");
		System.out.println(" a " + a);
		System.out.println(" b " + b);
		
		int temp = a;
		a = b;
		b = temp;
		
		System.out.println("After Swap");
		System.out.println(" a " + a);
		System.out.println(" b " + b);
		
		
	}

}
