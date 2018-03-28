package Seleniumtutorial;



import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LearningDropDown3 {

	private static List<WebElement> WebElement;

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps");
		driver.manage().window().maximize();
		System.out.println("Application lauched");
		driver.findElementById("username").sendKeys("DemoCSR");
		System.out.println("Username is success");
		
		driver.findElementById("password").sendKeys("crmsfa");
		System.out.println("Password is success");
		driver.findElementByClassName("decorativeSubmit").click();
		System.out.println("Login has success");
		driver.findElementByLinkText("CRM/SFA").click();
		System.out.println("CRM/SFA has success");
		
		//create lead
		driver.findElementByLinkText("Create Lead").click();
		
		
		Thread.sleep(2000);
		driver.findElementById("createLeadForm_companyName").sendKeys("Amazon");
		driver.findElementById("createLeadForm_firstName").sendKeys("Selva");
		driver.findElementById("createLeadForm_lastName").sendKeys("Avinash");
		driver.findElementByClassName("smallSubmit").click();
		System.out.println("Create Lead has success");
		Thread.sleep(2000);

		
        WebElement dropDown=driver.findElementById("createLeadForm_dataSourceId");
		Select source=new Select(dropDown);
		List<WebElement> value =source.getOptions();
		System.out.println("Dropdown contains :" + value.size());
		
		//Choose "Word of Mouth"
		source.selectByVisibleText("Word of Mouth");
		
		//print all currency options from currency dropdown
		WebElement dropDown1=driver.findElementById("createLeadForm_currencyUomId");
		Select currency=new Select(dropDown1);
		List<WebElement> value1=currency.getOptions();
		System.out.println("Dropdown list contains :"+value1.size());
		
		for(WebElement eachList:value1)
		{
			System.out.println(eachList.getText());
			
		}
		
		
		//Find leads
		driver.findElementByLinkText("Find Leads").click();
		Thread.sleep(2000);
		driver.findElementByXPath("//a[text()='12026']").click();
		driver.findElementByXPath("//*[@class='x-btn-text'][6]").click();
		

	

		
		/*
		
		WebElement dropDown=driver.findElementById("createLeadForm_dataSourceId");
		
		Select source=new Select(dropDown);
		
		List<WebElement> value =source.getOptions();
		System.out.println("Dropdown contains :" + value.size());
		

		
		for(WebElement eachElement:value)
		{
			System.out.println(eachElement.getText());
		}

		source.selectByIndex(2);
		System.out.println(value.get(2).getText());
		
		source.selectByValue("LEAD_COLDCALL");
*/
		

		driver.close();
		
		
		
		

		
	}

}
