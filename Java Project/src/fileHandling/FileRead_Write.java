package fileHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileRead_Write {

	public static void main(String[] args) throws IOException {
		
		
		try {
			
			File f = new File("D:\\Shaina\\demo.txt");
			FileWriter wr = new FileWriter(f);
			wr.write("Write the content in the file");
			
			wr.close();
			
			FileReader rd= new FileReader(f);
			char[] temp = new char[100];
			rd.read(temp);
			
			for (int i=0; i<temp.length;i++)
			{
				System.out.println(temp[i]);
			}
			
			rd.close();
		}
		catch (FileNotFoundException e)
		{
			System.out.println("File not Found");
		}
		
	

}
}
