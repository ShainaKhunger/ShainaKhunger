package automation;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Framework_Excel {
	
	String uname;
	
	public void getdata() throws IOException {
		
		FileInputStream fs =new FileInputStream("D:\\Shaina\\Quality Analyst\\Manual Testing\\Test Cases of Edit My profile.xlsx");
		
		@SuppressWarnings("resource")
		XSSFWorkbook wb= new XSSFWorkbook(fs);
		//XSSFSheet sheet = wb.getSheet("Login");
		XSSFSheet sheet= wb.getSheetAt(0);
		
		//To pick all the rows from the sheet
		
		System.out.println("Total rows are:" + sheet.getLastRowNum());
		
		XSSFRow row = sheet.getRow(3);
		XSSFCell cell = row.getCell(5);
		uname= cell.getStringCellValue();
		System.out.println("Username:" +uname);
	}
	
	

	public static void main(String[] args) throws IOException {
		
		Framework_Excel obj= new Framework_Excel();
		obj.getdata();
	}

}
