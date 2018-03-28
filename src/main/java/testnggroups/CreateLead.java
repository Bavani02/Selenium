package testnggroups;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

//import wdMethods.SeMethods;
import framework.SeMethods;



public class CreateLead extends SeMethods  {
	@Parameters({"browser","url","username","password"})
	@Test(groups={"smoke"})
	
	public  void creatLead(String Browser,String url,String username,String password) throws InterruptedException {
		//launch the browser
		//SeMethods se = new SeMethods();
		//navigate to url
		startApp(Browser,url);
		
		
		//Passing value to login page
		WebElement user = locateElement("id", "username");
		type(user, username);
		
		
		WebElement pwd = locateElement("id", "password");
		type(pwd, password);
		
		WebElement login = locateElement("class", "decorativeSubmit");
		click(login);
		
		//navigate to CRM/SFA
		WebElement crm = locateElement("link", "CRM/SFA");
		click(crm);
		//navigate to create lead page
		WebElement clickcreateLead=locateElement("link","Create Lead");
		click(clickcreateLead);
		
	    //Passing value to someother fields
		WebElement companyName=locateElement("id","createLeadForm_companyName");
		type(companyName, "Amazon");
		
		WebElement firstName=locateElement("id","createLeadForm_firstName");
		type(firstName, "Bavani");
		
		
		WebElement lastname=locateElement("id","createLeadForm_lastName");
		type(lastname, "detrt");
		
		WebElement source=locateElement("id", "createLeadForm_dataSourceId");
		selectDropDownUsingText(source, "Direct Mail");
		
		//Enter country code
		WebElement country=locateElement("id", "createLeadForm_primaryPhoneCountryCode");
		type(country,"91");
		
		
		//enter phone number
		WebElement phoneNum=locateElement("id", "createLeadForm_primaryPhoneNumber");
		type(phoneNum,"9884329058");
		//Click on find lead button
		WebElement button=locateElement("class","smallSubmit");
		click(button);
		
		
		closeBrowser();	
		
	}

}
