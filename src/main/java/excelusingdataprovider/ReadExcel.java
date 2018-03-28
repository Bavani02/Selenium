package excelusingdataprovider;

import java.io.File;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ReadExcel {



	//public  void readExcel() throws InvalidFormatException, IOException  {

	@Test
	public  String[][] readExcelSheet() throws InvalidFormatException, IOException
	{
		//create file path
		File excel = new File("./data/DeleteLead.xlsx");
		/*File excel = new File("./data/CreateLead.xlsx");*/

		//create workbook
		XSSFWorkbook workBook=new XSSFWorkbook(excel);

		//create a sheet
		XSSFSheet sheet=workBook.getSheet("DeleteLead");
		
		/*XSSFSheet sheet=workBook.getSheet("CreateLead");*/

		//get last row num
		int rowcount = sheet.getLastRowNum();

		//print total row count
		System.out.println("Row count is :"+rowcount);

		//get last cell num
		int columnCount=sheet.getRow(0).getLastCellNum();

		//print total cell count
		System.out.println("column count is :"+columnCount);
		
		/*Excel datas always stored in two dimensional array format only.
		create instance for String array*/
		String[][] data=new String[rowcount][columnCount];
		
		//Iterating no.rows,no.columns
		for (int i = 1; i <=rowcount; i++) {
			XSSFRow	row = sheet.getRow(i);
			for (int j = 0; j < columnCount; j++) {
				XSSFCell cell = row.getCell(j);

				System.out.println(cell.getStringCellValue());

				
				/* most of the time in excel sheet first row contains header only 
				 thats why mentioned always [row-1][column]*/
				data[i-1][j]=cell.getStringCellValue();
			}


		}
		return data;

	}

}

