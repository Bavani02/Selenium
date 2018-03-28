package Seleniumtutorial;

import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyUrls {

	public static void main(String[] args) {

		//launch the browser
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps");
		driver.manage().window().maximize();
		System.out.println("Application lauched");
		
		String url=driver.getCurrentUrl();
		System.out.println("Current URL is: "+url);
		
		driver.close();
		
		
		}
		}


				
	