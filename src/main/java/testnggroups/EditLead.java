package testnggroups;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

//import wdMethods.SeMethods;
import framework.SeMethods;

public class EditLead extends SeMethods  {

	@Test(groups={"sanity"},dependsOnGroups={"smoke"})

	//@Test(groups={"sanity"})


	public  void editlead() throws InterruptedException {
		//launch the browser
		//SeMethods se = new SeMethods();
		//navigate to url
		startApp("chrome", "http://leaftaps.com/opentaps");


		//Passing value to login page
		WebElement user = locateElement("id", "username");
		type(user, "DemoSalesManager");


		WebElement pwd = locateElement("id", "password");
		type(pwd, "crmsfa");

		WebElement login = locateElement("class", "decorativeSubmit");
		click(login);

		//navigate to CRM/SFA
		WebElement crm = locateElement("link", "CRM/SFA");
		click(crm);

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
		type(companyname,"Mobius mobius");
		
		//click update
		WebElement update=locateElement("class","smallSubmit");
		click(update);
		// Verify first name
		WebElement nameVerify=locateElement("id","viewLead_companyName_sp");
		verifyExactText(nameVerify, "Mobius mobius");


		closeBrowser();	

	}

}
