package javaClass;

public class Averageof3No {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		int x = 10;
		int y = 25;
		int z = 35;
		
		System.out.println("Enter the First Number  :" +x);
		System.out.println("Enter the Second Number :" +y);
		System.out.println("Enter the Third Number  :" +z);	
		
		// Declare sum variable
		
		double sum = 0.0;
		
		// Declare average variable
		
		double avg = 0.0;
		
		// Calculate the sum variable
		
		sum = x+y+z;
		
		// Calculate the average variable
		
		avg = sum/3;
		
		System.out.println("Average of Three Numbers:" +avg);
		
	}

}
