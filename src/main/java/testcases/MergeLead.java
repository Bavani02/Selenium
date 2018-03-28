package testcases;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;

import framework.SeMethods;

public class MergeLead   {


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
						
			//navigate to merge lead page
			WebElement mergeLink=se.locateElement("link", "Merge Leads");
			se.click(mergeLink);
			
			//click on fromlead icon
			WebElement lead= se.locateElement("xpath","(//img[@alt='Lookup'])[1]");
			se.click(lead);
			

			//Switch to child window
			se.switchToWindow(1);
			
			//Verify window titles
			se.verifyTitle("find leads");
			
			//Passing value to fields
			WebElement leadId= se.locateElement("xpath","//label[contains(text(),'Lead ID:')]/following::input");
			se.type(leadId, "10091");
			
			
			//click on find lead button
			WebElement leadButton=se.locateElement("xpath","//button[contains(text(),'Find Leads')]");
            se.click(leadButton); 
            
            //wait for some time
            Thread.sleep(3000);
            
          //click on resultgrid view values
			WebElement resuldGrid=se.locateElement("xpath", "//div[@class='x-grid3-cell-inner x-grid3-col-partyId'][1]/a");
			se.click(resuldGrid);
            
    		//Switch to parent window
    		se.switchToWindow(0);
    		//se.verifyTitle("Find Leads");
    		
    		//Click on  To Lead icon
    		WebElement toLeadIcon= se.locateElement("xpath","(//img[@alt='Lookup'])[2]");
    		se.click(toLeadIcon);
    		
    		//Switch to child1 window
    		se.switchToWindow(1);
    		
    		//Passing value to fields
    		WebElement leadId1= se.locateElement("xpath","//label[contains(text(),'Lead ID:')]/following::input");
            se.type(leadId1, "10094");    		
    		
          //click on find lead button
           WebElement findLead1 =se.locateElement("xpath","//button[contains(text(),'Find Leads')]");
           se.click(findLead1);
           
           Thread.sleep(3000);
           
           //Click on resulting view
           WebElement resultView1= se.locateElement("xpath","(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a");
           se.click(resultView1);
           
           //Switch to parent window
   		  se.switchToWindow(0);
   		  
   		  //Click on merge button
   		  WebElement mergeButton=se.locateElement("link","Merge");
   		  se.click(mergeButton);
   		  
   		  //Switchto Alert window
   		  
   		  se.acceptAlert();
   		  
   		  se.closeBrowser();
   	
   		  
   		 
   		  
   		  
	}

}
