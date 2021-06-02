package exceptionalHandling;

import java.io.IOException;

public class ThrowKeyword {
	
	public void checkAge(int age)  {
		
		if(age<18)
		{
			throw new ArithmeticException("Access denied- You must be at least 18 years old"); 
		}
		else
		{
			System.out.println("Access granted - You are old enough!");
		}
			
	}

	public static void main(String[] args) throws IOException  {
		
		ThrowKeyword obj = new ThrowKeyword();
		obj.checkAge(15);
	}

}
