package Seleniumtutorial;

import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyPageTitle {


	public static void main(String[] args) {

		//launch the browser
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		//driver.get("http://leaftaps.com/opentaps");
		driver.manage().window().maximize();
		System.out.println("Application lauched");
		
	/*	driver.findElementById("username").sendKeys("DemoCSR");
		System.out.println("Username is success");
		
		driver.findElementById("password").sendKeys("crmsfa");
		System.out.println("Password is success");
		
		driver.findElementByClassName("decorativeSubmit").click();
		System.out.println("Login has success");*/
		
		//Get pagetitle 
		 String expectedValue="Online Shopping Site for Mobiles, Fashion, Books, Electronics, Home Appliances and More";
         String actualValue=driver.getTitle();
		
		System.out.println("Actual Page title is: " + actualValue);	
		
		if(actualValue.equalsIgnoreCase(expectedValue))
		{
			System.out.println("Titles are matching");
		}
		else
		{
			System.out.println("Titles are not matching");
		}
		driver.close();
		//driver.quit();
		}
	
	}


				
	