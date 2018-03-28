package Seleniumtutorial;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class LearningFindElements {

		public static void main(String[] args) 
		{
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			ChromeDriver driver=new ChromeDriver();
			driver.get("https://www.google.co.in");
			driver.manage().window().maximize();
			
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			
			driver.findElementById("lst-ib").sendKeys("selva avinash"+Keys.ENTER);
			
			List<WebElement> showedLink=driver.findElementsByTagName("a");
			
			
			for(WebElement eachLink:showedLink)
			{
				System.out.println("Available link is :"+eachLink.getText());
				System.out.println("Available link is :"+eachLink.getText().toUpperCase().contains("selva avinash"));
			}
			driver.close();
			
		}

	}


