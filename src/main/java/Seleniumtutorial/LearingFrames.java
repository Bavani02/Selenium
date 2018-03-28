package Seleniumtutorial;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LearingFrames {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_select");
		driver.get("http://layout.jquery-dev.com/demos/iframes_many.html");
	
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		
		List<WebElement> totalFrames=driver.findElementsByTagName("iframe");
		
		for(WebElement frames:totalFrames)
		
		System.out.println("Total No.of frame :"+frames);
		
		//driver.switchTo().frame("ui-layout-north ui-layout-pane ui-layout-pane-north");
		
		

		/*driver.switchTo().frame("iframeResult");
		
		WebElement value=driver.findElementByTagName("select");
		
		Select dropDown=new Select(value);
		dropDown.selectByVisibleText("Audi");
		System.out.println("Select from Audi");
		
		driver.switchTo().defaultContent();
		driver.findElementById("tryhome").click();
		System.out.println("Successfully entered home page");
*/
		driver.close();	
		
	}

	
		
	}


