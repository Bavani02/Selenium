package seleniumtutorialclasswork;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearningFindElements {

	public static void main(String[] args) throws InterruptedException {
		//1. Launch Chrome Browser
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		//2. Load AUT -Google Search
		driver.get("https://www.google.co.in");
		
		driver.findElementById("lst-i44").sendKeys("TestLeaf" + Keys.ENTER);
		Thread.sleep(3000);
		List<WebElement> allLinks = driver.findElementsByTagName("a");
		
		for(WebElement eachLink :allLinks)
		{
			System.out.println("Link is " + eachLink.getText() );
		}

	}

}







