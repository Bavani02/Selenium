package Seleniumtutorial;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.gargoylesoftware.htmlunit.javascript.host.dom.Text;

public class LearningScreenshot {


	public static void main(String[] args) throws IOException {

		//launch the browser
				System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
				ChromeDriver driver=new ChromeDriver();
				
				driver.get("http://leaftaps.com/opentaps");
				
				File srcImage=driver.getScreenshotAs(OutputType.FILE);
				File destImage=new File("./Screenshot/image.png");
                FileUtils.copyFile(srcImage, destImage);

				
				driver.manage().window().maximize();
				System.out.println("Application lauched");
				
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

				
				
				
				driver.findElementById("username").sendKeys("DemoCSR");
				System.out.println("Username is success");
				
				//forgot password isdisplayed or not
			 	/*boolean forgotPassword=driver.findElementByXPath("//*[@id='forgotpasswd']").isDisplayed();
			 	
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
*/				driver.findElementById("password").sendKeys("crmsfa");
				 
				 System.out.println("Password is success");
				
				
				 
				driver.findElementByClassName("decorativeSubmit").click();
				System.out.println("Login has success");
				
				FileUtils.copyFile(driver.getScreenshotAs(OutputType.FILE), new File("./Screenshot/image1.png"));
				
				/*String text=driver.findElementByXPath("//*[@id='form']/h2").getText();
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