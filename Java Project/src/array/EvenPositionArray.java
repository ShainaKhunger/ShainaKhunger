package array;

public class EvenPositionArray {

	public static void main(String[] args) {
		
		int[] arr = new int[] {2,4,6,8,10,12,14};
		
		System.out.println("Elements of given array present on even position: ");
		
		for (int i=1; i<arr.length; i=i+2)
		{
			System.out.println(arr[i]);
		}
		
		System.out.println("");
		
		System.out.println("Even Numbers: ");
	
		
		for(int j=0; j<arr.length; j++)
		{
			if (arr[j]%2==0);
			
			System.out.println(arr[j]);
			
		}
			
			System.out.println("");
			
			System.out.println("Enter the size of the array");
			
			System.out.println(arr.length);
		
		int sum = 0;
		
		for(int k=0; k<arr.length; k++)
		{
			sum= sum + arr[k];
		}
		
			System.out.println("");
			
			System.out.println("Sum of all the elements of array:");
			System.out.println(sum);
		
		

	}

}
