package testing;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
//import java.util.Scanner;

public class Demo1 {

	public static void main(String[] args) {
		
		/*
		 * try {
		 * 
		 * @SuppressWarnings("resource") Scanner input =new Scanner(System.in);
		 * 
		 * System.out.println("Enter the first num"); int n1 = input.nextInt();
		 * 
		 * System.out.println("Enter the second num"); int n2 = input.nextInt();
		 * 
		 * int sum = n1/n2; System.out.println(sum);
		 * 
		 * } catch(Exception e) { System.out.println("You can't do this"); }
		 */
		
		try{
			File f= new File("D:\\Shaina\\Quality Analyst\\Notepad\\fileRead.txt");
			
			FileWriter wr= new FileWriter(f);
			wr.write("I miss you Massi G");
			wr.close();
			
			FileReader rd=new FileReader(f);
			char[] temp =new char[100];
			rd.read(temp);

			for(int i=0; i<temp.length; i++)
				{
				   System.out.println(temp[i]);
				}
			
			rd.close();
			}
			catch(Exception e)
				{
				   System.out.println("File not found");
				}

	}

}
