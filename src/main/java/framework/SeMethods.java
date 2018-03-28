package framework;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;

public class SeMethods implements WdMethods{

	RemoteWebDriver driver = null;

	int i=0;

	@Override
	public void startApp(String browser, String url) {
		try {
			if (browser.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
				driver = new ChromeDriver();
			} else {
				System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
				driver = new FirefoxDriver();
			}
			driver.get(url);
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.manage().window().maximize();
			System.out.println("The browser " + browser + " is launched");
		} catch (WebDriverException e) {
			System.err.println("Driver not able to access");
			throw new RuntimeException();
		}finally 
		{
			takeSnap();
		}

	}

	@Override
	public WebElement locateElement(String locator, String locValue) {
		WebElement ele = null;
		try {
			switch (locator) {
			case "id":
				ele = driver.findElementById(locValue);
				break;
			case "link":
				ele = driver.findElementByLinkText(locValue);
				break;
			case "xpath":
				ele = driver.findElementByXPath(locValue);
				break;
			case "class":
				ele = driver.findElementByClassName(locValue);
				break;
			case "name":
				ele = driver.findElementByClassName(locValue);
				break;

			}
		} catch (NoSuchElementException e) {

			System.err.println("The Element With locator"+locValue+"Does not appear");
			throw new RuntimeException();
		}

		finally {
			takeSnap();
		}
		return ele;

	}



	@Override
	public void type(WebElement ele, String data) {
		try {
			ele.clear();
			ele.sendKeys(data);
			System.out.println("The text " + data + " is entered");
		} catch (WebDriverException e) {

			System.err.println("The type value could not capatured");
			throw new RuntimeException();

		}
	}

	@Override
	public void click(WebElement ele) {
		try {
			String text = ele.getText();
			ele.click();
			System.out.println("The element " + text + " is clicked");
		} catch (WebDriverException e) {

			System.err.println("The text not present in the page");

		}

	}

	@Override
	public String getText(WebElement ele) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void selectDropDownUsingText(WebElement ele, String value) {
		try {
			Select source = new Select(ele);
			source.selectByVisibleText(value);
			System.out.println("The value is:" + value + "is selected");
		} catch (WebDriverException e) {
			System.err.println("The Dropdown Element could not able to clicked");
		}

	}

	@Override
	public void selectDropDownUsingIndex(WebElement ele, int index) {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean verifyTitle(String expectedTitle) {


		String pageTitle = driver.getTitle();
		System.out.println("Actual Page title is: " + pageTitle);
		if (pageTitle.contains(expectedTitle)) {
			System.out.println("Expected Title is " + pageTitle );
			
		} else {
			System.out.println("Expected Title is not matching");
		} 

		return false;
	}

	@Override
	public void verifyExactText(WebElement ele, String expectedText) {

		
		String text=ele.getText();
		System.out.println(text);
		
		if(text.contains(expectedText))
		{
			System.out.println("Expected text is "+text);
		}
		else
		{
			System.out.println("Displayed text is wrong");
		}
	
		
		



	}

	@Override
	public void verifyPartialText(WebElement ele, String expectedText) {
		// TODO Auto-generated method stub

	}

	@Override
	public void verifyExactAttribute(WebElement ele, String attribute, String value) {
		// TODO Auto-generated method stub

	}

	@Override
	public void verifyPartialAttribute(WebElement ele, String attribute, String value) {
		// TODO Auto-generated method stub

	}

	@Override
	public void verifySelected(WebElement ele) {
		// TODO Auto-generated method stub

	}

	@Override
	public void verifyDisplayed(WebElement ele) {

		//verify method



	}

	@Override
	public void switchToWindow(int index) {
		try {
			Set<String> allWindows = driver.getWindowHandles();
			List<String> allWindowHandles = new ArrayList<String>();
			allWindowHandles.addAll(allWindows);
			String secondWindow = allWindowHandles.get(index);
			driver.switchTo().window(secondWindow);
		} catch (NoAlertPresentException e) {
			// TODO: handle exception
		}
		finally
		{
			takeSnap();
		}



	}

	@Override
	public void switchToFrame(WebElement ele) {
		// TODO Auto-generated method stub

	}

	@Override
	public void acceptAlert() {
		Alert obj = driver.switchTo().alert();

		System.out.println("The text is displayed "+obj.getText());
		obj.accept();


	}

	@Override
	public void dismissAlert() {
		Alert obj = driver.switchTo().alert();
		System.out.println("The text is displayed "+obj.getText());
		obj.dismiss();


	}

	@Override
	public String getAlertText() {
		Alert alt = driver.switchTo().alert();
		System.out.println("Alert text is : "+alt);

		return null;
	}


	@Override
	public void takeSnap() {

		/*File src=driver.getScreenshotAs(OutputType.FILE);
		File tgt=new File("./Screenshot");
		FileUtils.copyFile(scr,tgt);
		 */
		{
			try {
				FileUtils.copyFile(driver.getScreenshotAs(OutputType.FILE),new File("./Screenshot/screen" +i+".jpg"));
			} catch (WebDriverException | IOException e) {
				System.err.println("The screenshot could not be captured");			}

		}i++;


		//return 0;
	}

	@Override
	public void closeBrowser() {

		driver.close();


	}

	@Override
	public void closeAllBrowsers() {
		// TODO Auto-generated method stub

	}




}
