package array;

public class TwoDArray {

	public static void main(String[] args) {
		 
		int[] [] ar = {{1,2,3,}, {4,5,6}, {7,8,9}};
		
		int sum=0;
		
		for (int r=0; r<ar.length; r++)
		{
			for(int c=0; c<ar.length; c++)
			{
				System.out.print(ar[r][c]);
				sum =sum + ar[r][c];
			}
			
			
			System.out.println(" Sum of the elements " + sum);
			
		}

}
}
