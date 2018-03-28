package dataprovider;

import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import excelusingdataprovider.ReadExcel;
import framework.Annotations;
import framework.SeMethods;

public class DeleteRecord extends Annotations  {
	@Test(dataProvider="DeleteRecord")

	//@Test(groups={"sanity"})


	public  void deletelead(String phonenum) throws InterruptedException {

		//launch the browser
		//SeMethods se = new SeMethods();
		
		//navigate to leads page
		WebElement leadTab=locateElement("link","Leads");
		click(leadTab);

		//click on find leads
		WebElement findLead=locateElement("link","Find Leads");
		click(findLead);


		//Click on phone tab
		WebElement phoneTab=locateElement("link","Phone");
		click(phoneTab);

		/*WebElement countrycode=locateElement("xpath", "//*[@id='ext-gen262']");
		type(countrycode, code);*/


		WebElement phoneNum=locateElement("xpath", "//*[@id='ext-gen270']");
		type(phoneNum,phonenum );

		Thread.sleep(3000);

		//click on find lead buuton
		WebElement findLeadButton=locateElement("xpath","//button[contains(text(),'Find Leads')]");
		click(findLeadButton);

		Thread.sleep(3000);

		//click on result view grid
		WebElement resultView=locateElement("xpath","//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a");
		click(resultView);


		WebElement deletebutton=locateElement("link","Delete");
		click(deletebutton);



	}
	@DataProvider(name="DeleteRecord")
	public static Object[][] getData() throws InvalidFormatException, IOException
	{
		/*Object[][] input=new Object[1][2];
		input[0][0]="9553825664";
		input[0][1]="9884329058";
		return input;*/
		
		/*create instance object of readExcel class why because ReadExcel class 
		in another package*/
		ReadExcel excel=new ReadExcel();

		//call the  readExcelSheet method(this method came from ReadExcel class)
		String[][] values=excel.readExcelSheet();

		return values;
		
		
	}

}
