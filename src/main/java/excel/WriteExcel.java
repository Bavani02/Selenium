package excel;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class WriteExcel {
	@Test
	public void writeExcelSheet() throws InvalidFormatException, IOException
	{
		
		//create file path
		String excelFileName="./data/test1.xlsx";
		
		//assign sheet name
		String sheetName="DeleteLead";
		
		
		//create instance for XSSFWorkbook
		XSSFWorkbook workBook=new XSSFWorkbook();
		
		//get sheet from workbook
		XSSFSheet sheet=workBook.createSheet(sheetName);
		
		//Iterating no.rows and no.columns 
		for (int r = 0; r < 5; r++) {
			//get row from sheet
			XSSFRow row=sheet.createRow(r);
			/*int rowCount=row.getRowNum();
			System.out.println("Row count is: "+rowCount);*/
			for (int c = 1; c < 5; c++) {
				
				XSSFCell cell=row.createCell(c);
				
				cell.setCellValue("cell"+r+" "+c);
			}
		}
		
		FileOutputStream fileOut = new FileOutputStream(excelFileName);
		
		//write this workBook to an OutputStream
		workBook.write(fileOut);
		//
		fileOut.flush();
		fileOut.close();

	}
	
	

}
