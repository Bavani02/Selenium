package excel;

import java.io.File;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ReadExcel {

	@Test
	public  void readExcel() throws InvalidFormatException, IOException  {

		File excel = new File("./data/CreateLead.xlsx");

		XSSFWorkbook workBook=new XSSFWorkbook(excel);

		XSSFSheet sheet=workBook.getSheet("CreateLead");


		int rowcount = sheet.getLastRowNum();
		
		System.out.println("Row count is :"+rowcount);

		int columnCount=sheet.getRow(0).getLastCellNum();
		
		System.out.println("column count is :"+columnCount);


		for (int i = 1; i <=rowcount; i++) {
			XSSFRow	row = sheet.getRow(i);
			for (int j = 0; j < columnCount; j++) {
				XSSFCell cell = row.getCell(j);

				System.out.println(cell.getStringCellValue());
			}


		}

	}

}

