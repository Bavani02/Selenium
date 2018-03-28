package testcases;

import org.openqa.selenium.WebElement;

import framework.SeMethods;

public class DeleteRecord  {

	public static void main(String[] args) throws InterruptedException {
		
		//launch the browser
		SeMethods se = new SeMethods();
		//navigate to url
		se.startApp("chrome", "http://leaftaps.com/opentaps");
		
		
		//Passing value to login page
		WebElement user = se.locateElement("id", "username");
		se.type(user, "DemoSalesManager");
		
		
		WebElement pwd = se.locateElement("id", "password");
		se.type(pwd, "crmsfa");
		
		WebElement login = se.locateElement("class", "decorativeSubmit");
		se.click(login);
		
		//navigate to CRM/SFA
		WebElement crm = se.locateElement("link", "CRM/SFA");
		se.click(crm);
		
		//navigate to leads page
		WebElement leadTab=se.locateElement("link","Leads");
		se.click(leadTab);
		
		//click on find leads
		WebElement findLead=se.locateElement("link","Find Leads");
		se.click(findLead);
	
		
		//Click on phone tab
		WebElement phoneTab=se.locateElement("link","Phone");
		se.click(phoneTab);
		
		WebElement code=se.locateElement("xpath", "//*[@id='ext-gen262']");
		se.type(code, "91");
		
		
		WebElement phoneNum=se.locateElement("xpath", "//*[@id='ext-gen270']");
		se.type(phoneNum, "2345678998");
		
		//click on find lead buuton
		WebElement findLeadButton=se.locateElement("xpath","//button[contains(text(),'Find Leads')]");
		se.click(findLeadButton);
		
		Thread.sleep(3000);
		
		//click on result view grid
		WebElement resultView=se.locateElement("xpath","//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a");
		se.click(resultView);
		
		
		WebElement deletebutton=se.locateElement("link","Delete");
		se.click(deletebutton);
		
		se.closeBrowser();
		

	}

}
