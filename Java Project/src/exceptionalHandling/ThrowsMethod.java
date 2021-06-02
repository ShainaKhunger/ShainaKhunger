package exceptionalHandling;

public class ThrowsMethod {
	
	public void division(int n1, int n2) throws ArithmeticException
	{
		int n = n1/n2;
		System.out.println(n);
	}
	

	public static void main(String[] args) {
		
		ThrowsMethod obj = new ThrowsMethod ();
		
		try 
		{
			obj.division(10, 0);
		}
		catch (ArithmeticException e)
		{
			System.out.println("Exception Handled");
		}
	}

}
