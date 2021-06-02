package array;

import java.util.Scanner;

public class UserdefineArray {

	public static void main(String[] args) {
		
		int len;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Array Length: ");
		len =sc.nextInt();
		
		int[] arr = new int [len];
		System.out.println("Enter " + len + " Elements to store in Array :");
		
		for(int i=0; i<len; i++)
		{
			arr[i]= sc.nextInt();
		}
		
		System.out.println("Elements in Array are:");
		
		for(int i=0; i<len; i++)
		{
			System.out.print(arr[i] + " ");
		}
		
		sc.close();
	}

}
