package dataprovider;

import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import framework.Annotations;
//import wdMethods.SeMethods;
import framework.SeMethods;

public class EditLead extends Annotations  {


	//@Test(groups={"sanity"})
	

	@Test(dataProvider="Editlead")

	public  void editlead(String compname) throws InterruptedException {
		//launch the browser
		//SeMethods se = new SeMethods();
		
		//Click on lead tab
		WebElement lead=locateElement("link","Leads");
		click(lead);

		//navigate to find lead page
		WebElement findLead=locateElement("link","Find Leads");
		click(findLead);

		//Passing value to someother fields
		WebElement firstName=locateElement("xpath","(//input[@name='firstName'])[3]");
		type(firstName, "Bavani");

		//click find lead button
		WebElement leadButton=locateElement("xpath","//button[contains(text(),'Find Leads')]");
		click(leadButton);

		Thread.sleep(3000);

		WebElement resultGrid=locateElement("xpath","//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a");
		click(resultGrid);


		//verify title
		verifyTitle("View Lead | opentaps CRM");

		//click edit
		WebElement editButton=locateElement("link","Edit");
		click(editButton);

		//change company name
		WebElement companyname=locateElement("id","updateLeadForm_companyName");
		type(companyname,compname);
		
		//click update
		WebElement update=locateElement("class","smallSubmit");
		click(update);
		// Verify first name
		WebElement nameVerify=locateElement("id","viewLead_companyName_sp");
		verifyExactText(nameVerify, compname);

	}
	
	@DataProvider(name="Editlead")
	public static Object[][] getData()
	{
		Object[][] input=new Object[1][2]; 
		input[0][0]="Thinksoft";
		input[0][1]="Verizon";
				
		return input;
		
	}

}
