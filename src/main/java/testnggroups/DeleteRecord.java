package testnggroups;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import framework.SeMethods;

public class DeleteRecord extends SeMethods  {
	@Test(groups={"sanity"},dependsOnGroups={"smoke"})

	//@Test(groups={"sanity"})


	public  void deletelead() throws InterruptedException {

		//launch the browser
		SeMethods se = new SeMethods();
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

		//navigate to leads page
		WebElement leadTab=locateElement("link","Leads");
		click(leadTab);

		//click on find leads
		WebElement findLead=locateElement("link","Find Leads");
		click(findLead);


		//Click on phone tab
		WebElement phoneTab=locateElement("link","Phone");
		click(phoneTab);

		WebElement code=locateElement("xpath", "//*[@id='ext-gen262']");
		type(code, "91");


		WebElement phoneNum=locateElement("xpath", "//*[@id='ext-gen270']");
		type(phoneNum, "9884329058");

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

		closeBrowser();


	}

}
