package Seleniumtutorial;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnWindowHandle {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		//Initialize the driver
		ChromeDriver driver=new ChromeDriver();
		
		//navigate the url
		driver.get("http://leaftaps.com/opentaps");
		
		//maximize the window
		driver.manage().window().maximize();
		System.out.println("Application lauched");
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		//pass the user creadentials
		driver.findElementById("username").sendKeys("DemoSalesManager");
		System.out.println("Username is success");
		driver.findElementById("password").sendKeys("crmsfa");
		System.out.println("Password is success");
		driver.findElementByClassName("decorativeSubmit").click();
		System.out.println("Login has success");
		
		//navigate the CRM/SFA
		driver.findElementByLinkText("CRM/SFA").click();
		System.out.println("CRM/SFA has success");
		driver.findElementByLinkText("Create Lead").click();
		System.out.println("Create Lead has success");
		
		
		//navigate to Merge leads
		driver.findElementByLinkText("Merge Leads").click();
		
		//Click on Icon near From Lead
		driver.findElementByXPath("(//img[@alt='Lookup'])[1]").click();
		Thread.sleep(2000);
		
		//To access the second window using window handle. there create a object then store the value to it.
		
		Set<String> allWindows=driver.getWindowHandles();
		
		//create a list object of windowhandles
		List<String> allWindowHandles=new ArrayList<String>();
		
		allWindowHandles.addAll(allWindows);
		
		
		
		String secondWindow=allWindowHandles.get(1);
		
		driver.switchTo().window(secondWindow);
		Thread.sleep(1000);
		
		//Get title from second window
		System.out.println(driver.getTitle());
		
		//pass lead id
		driver.findElementByXPath("//label[contains(text(),'Lead ID:')]/following::input").sendKeys("10185");
		
		//click on find lead button
		driver.findElementByXPath("//button[contains(text(),'Find Leads')]").click();
		Thread.sleep(1000);
		
		//click on result view values
		driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a").click();
		
		//switch back to parent window
		String parent=allWindowHandles.get(0);
		
		driver.switchTo().window(parent);
		
		//Get Title from parent window
		System.out.println(driver.getTitle());
		
		//Click on Icon near To Lead 
		driver.findElementByXPath("(//img[@alt='Lookup'])[2]").click();
		
		Thread.sleep(2000);
      Set<String> leadWindows=driver.getWindowHandles();
		
		//create a list object of windowhandles
		List<String> leadWindowHandles=new ArrayList<String>();
		
		leadWindowHandles.addAll(leadWindows);
		
		//To access the Lead window using window handle. there create a object then store the value to it.
		
		
		String thirdWindow=leadWindowHandles.get(1);
		
		driver.switchTo().window(thirdWindow);
		Thread.sleep(1000);
		
		//Get title from lead window
		System.out.println(driver.getTitle());
		
		//pass lead id
		driver.findElementByXPath("//label[contains(text(),'Lead ID:')]/following::input").sendKeys("10289");
				
		//click on find lead
		driver.findElementByXPath("//button[contains(text(),'Find Leads')]").click();
		Thread.sleep(1000);
		
		//Click First Resulting lead
		driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a").click();
		
		//switch back to parent window
		 parent=allWindowHandles.get(0);
				
		driver.switchTo().window(parent);
		
		//click on merge button
		driver.findElementByLinkText("Merge").click();
		
		
		//switch to alert
		Alert leafTap=driver.switchTo().alert();
		
		//get value from alert
		String alert=leafTap.getText();
		//click on accept
		leafTap.accept();

		System.out.println(alert);
				
	}

}
