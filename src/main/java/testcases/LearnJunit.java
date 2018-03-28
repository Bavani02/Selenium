package testcases;

import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;

import framework.SeMethods;

public class LearnJunit extends SeMethods {
	@Test
		public  void snapshot() throws InterruptedException {
			//launch the browser
		
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
						
			//navigate to merge lead page
			WebElement mergeLink=locateElement("link", "Merge Leads");
			click(mergeLink);
			
			//click on fromlead icon
			WebElement lead= locateElement("xpath","(//img[@alt='Lookup'])[1]");
			click(lead);
			

			//Switch to child window
			switchToWindow(1);
			
			//Verify window titles
			verifyTitle("find leads");
			
			//Passing value to fields
			WebElement leadId= locateElement("xpath","//label[contains(text(),'Lead ID:')]/following::input");
			type(leadId, "10091");
			
			
			//click on find lead button
			WebElement leadButton=locateElement("xpath","//button[contains(text(),'Find Leads')]");
            click(leadButton); 
            
            //wait for some time
            Thread.sleep(3000);
            
          //click on resultgrid view values
			WebElement resuldGrid=locateElement("xpath", "//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a");
			click(resuldGrid);
            
    		//Switch to parent window
    		switchToWindow(0);
    		//verifyTitle("Find Leads");
    		
    		//Click on  To Lead icon
    		WebElement toLeadIcon= locateElement("xpath","(//img[@alt='Lookup'])[2]");
    		click(toLeadIcon);
    		
    		//Switch to child1 window
    		switchToWindow(1);
    		
    		//Passing value to fields
    		WebElement leadId1= locateElement("xpath","//label[contains(text(),'Lead ID:')]/following::input");
            type(leadId1, "10094");    		
    		
          //click on find lead button
           WebElement findLead1 =locateElement("xpath","//button[contains(text(),'Find Leads')]");
           click(findLead1);
           
           Thread.sleep(3000);
           
           //Click on resulting view
           WebElement resultView1= locateElement("xpath","(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a");
           click(resultView1);
           
           //Switch to parent window
   		  switchToWindow(0);
   		  
   		  //Click on merge button
   		  WebElement mergeButton=locateElement("link","Merge");
   		  click(mergeButton);
   		  
   		  //Switchto Alert window
   		  
   		  acceptAlert();
   	
   		  //Get text from alert window 
   		 String alertText= getAlertText();
   		 System.out.println(alertText);
   		 
   		  
 		  
	}

}
