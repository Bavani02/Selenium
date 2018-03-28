package Seleniumtutorial;

import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyCurrentUrl {

	public static void main(String[] args) {

		//launch the browser
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps");
		
		driver.manage().window().maximize();
		System.out.println("Application lauched");
		
		String url=driver.getCurrentUrl();
		System.out.println("Before login URL is: "+url);
		
		driver.findElementById("username").sendKeys("DemoCSR");
		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		String url1 =driver.getCurrentUrl();
		System.out.println("after login URL is: "+url1);

		driver.close();
		
		
		}
		}


				
	