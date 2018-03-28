package Seleniumtutorial;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.gargoylesoftware.htmlunit.javascript.host.dom.Text;

public class VerifyExactUser {

	public static void main(String[] args) {

		//launch the browser
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("http://leaftaps.com/opentaps");
		
		driver.manage().window().maximize();
		System.out.println("Application lauched");
		
		driver.findElementById("username").sendKeys("DemoCSR");
		System.out.println("Username is success");
		
		//Enter wrong password
		driver.findElementById("password").sendKeys("bcder");
		//forgot password isdisplayed or not
	 	boolean forgotPassword=driver.findElementByXPath("//*[@id='forgotpasswd']").isDisplayed();
	 	
	 	if(forgotPassword)
	 	{
	 		System.out.println("true");
	 	
	 	}
	 	else
	 	{
	 		System.out.println("False");

	 	}
	 	driver.findElementByXPath("//*[@id='form']/h3/a").click();
	 	boolean forgotPassword1=driver.findElementByXPath("//*[@id='forgotpasswd']").isDisplayed();
	 	if(forgotPassword1)
	 	{
	 		System.out.println("true");
	 	
	 	}
	 	else
	 	{
	 		System.out.println("False");

	 	}
		/*driver.findElementById("password").sendKeys("crmsfa");
		 
		 System.out.println("Password is success");
		
		
		 
		driver.findElementByClassName("decorativeSubmit").click();
		System.out.println("Login has success");
		
		String text=driver.findElementByXPath("//*[@id='form']/h2").getText();
		System.out.println("Actual text is :"+text);
		
		WebElement userName=driver.findElementById("username");
		System.out.println(userName.getAttribute("class"));
		
		 if(text.contains("Demo B2B CSR"))
		{
			System.out.println("Exact text only displayed");
		
						
	}
		else
		{

			System.out.println("Wrong text only displayed");
         }
		String tagValue=driver.findElementByXPath("//*[@id='username']").getTagName();
		System.out.println("Value is :" +tagValue);
		WebElement userName=driver.findElementById("username");
		System.out.println(userName.getAttribute("id"));
*/	
		 	driver.close();
		
     }
   }