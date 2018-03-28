package testcases;

import org.openqa.selenium.WebElement;

//import wdMethods.SeMethods;
import framework.SeMethods;

public class CreateLead  {
	
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
		//navigate to create lead page
		WebElement clickcreateLead=se.locateElement("link","Create Lead");
		se.click(clickcreateLead);
		
	    //Passing value to someother fields
		WebElement companyName=se.locateElement("id","createLeadForm_companyName");
		se.type(companyName, "Amazon");
		
		WebElement firstName=se.locateElement("id","createLeadForm_firstName");
		se.type(firstName, "Bavani");
		
		
		WebElement lastname=se.locateElement("id","createLeadForm_lastName");
		se.type(lastname, "detrt");
		
		WebElement source=se.locateElement("id", "createLeadForm_dataSourceId");
		se.selectDropDownUsingText(source, "Direct Mail");
		
		//Click on find lead button
		WebElement button=se.locateElement("class","smallSubmit");
		se.click(button);
		
		
		se.closeBrowser();	
		
	}

}
