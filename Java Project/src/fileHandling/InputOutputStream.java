package fileHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;



public class InputOutputStream {

	public static void main(String[] args) throws IOException {
		
		try {
		
		@SuppressWarnings("resource")
		FileInputStream fileobj = new FileInputStream ("D:\\Shaina\\demo.txt");
		
		for(int i =0; i<fileobj.available();i++)
			{
				System.out.println((char)fileobj.read());
			}
			}
		catch(FileNotFoundException e)
			{
				System.out.println("File not found");
			}
		
	}
}


