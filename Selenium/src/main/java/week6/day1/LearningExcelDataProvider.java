package week6.day1;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class LearningExcelDataProvider {

	/*public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		XSSFWorkbook wBook = new XSSFWorkbook("./data/tc002.xlsx");
		XSSFSheet sheet =wBook.getSheet("Form Responses 1");
		//wBook.getSheetAt(0);
	
		int lastRowNum = sheet.getLastRowNum();
		XSSFRow row1 = sheet.getRow(0);
		int lastCellNum = row1.getLastCellNum();
		System.out.println("The total number of rows is " + lastRowNum);
		for (int i = 1; i <= lastRowNum; i++) {
			
			XSSFRow rowData = sheet.getRow(i);

			System.out.println("The total number of columns is " + lastCellNum);

			for(int j=0;j<lastCellNum ;j++) {
				XSSFCell cell = rowData.getCell(j);
				String cellValue = cell.getStringCellValue();
				System.out.println(cellValue);
			}*/
	public Object[][] readExcel() throws IOException{
		
		XSSFWorkbook wBook = new XSSFWorkbook("./data/tc001.xlsx");
		XSSFSheet sheet =wBook.getSheet("Form Responses 1");
		//wBook.getSheetAt(0);
	
		int lastRowNum = sheet.getLastRowNum();
		XSSFRow row1 = sheet.getRow(0);
		int lastCellNum = row1.getLastCellNum();
		System.out.println("The total number of rows is " + lastRowNum);
		Object [][] data = new Object[lastRowNum][lastCellNum];
		for (int i = 1; i <= lastRowNum; i++) {
			
			XSSFRow rowData = sheet.getRow(i);

			System.out.println("The total number of columns is " + lastCellNum);

			for(int j=0;j<lastCellNum ;j++) {
				XSSFCell cell = rowData.getCell(j);
				String cellValue = cell.getStringCellValue();
				data[i-1][j]=cellValue;
				System.out.println(cellValue);
			}
		}
		return data;
		
	}

}
