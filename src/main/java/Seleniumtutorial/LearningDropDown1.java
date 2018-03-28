package Seleniumtutorial;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LearningDropDown1 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps");
		driver.manage().window().maximize();
		System.out.println("Application lauched");
		driver.findElementById("username").sendKeys("DemoCSR");
		System.out.println("Username is success");
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.findElementById("password").sendKeys("crmsfa");
		System.out.println("Password is success");
		driver.findElementByClassName("decorativeSubmit").click();
		System.out.println("Login has success");
		driver.findElementByLinkText("CRM/SFA").click();
		System.out.println("CRM/SFA has success");
		
		//create lead
		driver.findElementByLinkText("Create Lead").click();
		System.out.println("Create Lead has success");
		
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

		

		driver.close();
		
		
		
		

		
	}

}
