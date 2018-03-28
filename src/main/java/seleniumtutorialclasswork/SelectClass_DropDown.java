package seleniumtutorialclasswork;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectClass_DropDown {

	public static void main(String[] args) throws Exception {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		//ClassName objectName = new ClassName();
		ChromeDriver driver = new ChromeDriver();
		
		//maximize the browser
		driver.manage().window().maximize();
	
		//Load URL 
		driver.get("https://www.irctc.co.in/eticketing/userSignUp.jsf");
		
		driver.findElementById("userRegistrationForm:securityQ").sendKeys("What was the name of your first school?");
		
		Thread.sleep(3000);

		WebElement element = driver.findElementById("userRegistrationForm:securityQ");
		
		Select dropDown = new Select(element);
		
		dropDown.selectByVisibleText("Where did you first meet your spouse?");
		
		String txt = driver.findElementById("userRegistrationForm:securityQ").getText();
		
		WebElement occupationElement = driver.findElementById("userRegistrationForm:occupation");

		Select occupationDDown = new Select(driver.findElementById("userRegistrationForm:occupation"));

		occupationDDown.selectByIndex(5);

		occupationDDown.selectByValue("2");
		
		List<WebElement> occpList = occupationDDown.getOptions();

		for (WebElement eachOccupation : occpList) {
			System.out.println("Element: "+eachOccupation.getText());
			occupationDDown.selectByVisibleText(eachOccupation.getText());
		}
		
		int listSize = occpList.size();
		
		System.out.println("The Length of the List: "+listSize);
		
		occupationDDown.selectByIndex(listSize-1);
		
		
		
		
		
		
		
		









	}

}

    