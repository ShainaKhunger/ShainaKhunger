package secondAssignment;

import java.util.Scanner;

public class NumberOfNotes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int Rs[]={1000,500,100,50,20,10,5,2,1}; 
		 
		System.out.print("Enter any Amount : "); 
		int amt = sc.nextInt();
 
		
		int copy=amt; 
		int totalNotes=0,count=0;
 
		System.out.println("\nRs OMINATIONS : \n");
		sc.close();
		
		for(int i=0;i<9;i++) 
		{
			
			count=amt/Rs[i]; 
			if(count!=0) 
			{
				System.out.println(Rs[i]+"\tx\t"+count+"\t= "+Rs[i]*count);
			}
			totalNotes=totalNotes+count; 
			amt=amt%Rs[i]; 
		}
 
		System.out.println("--------------------------------");
 
		// printing the total amount
		System.out.println("TOTAL\t\t\t= "+copy); 
		System.out.println("--------------------------------");
 
		// printing the total number of notes
		System.out.println("Total Number of Notes\t= "+totalNotes); 
	}

}
