package Seleniumtutorial;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleWindowPopups {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		//WebDriver driver=new ChromeDriver();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://www.popuptest.com/goodpopups.html");
		driver.manage().window().maximize();
		
		driver.findElementByLinkText("Good PopUp #3").click();
		
		Thread.sleep(2000);
		
		System.out.println("Popup dislayed:Good PopUp #3");
		
		Set<String> handler=driver.getWindowHandles();
		
		Iterator<String> iter=handler.iterator();
		
		String parentWindowId=iter.next();
		
		System.out.println("Parent Window Id is:"+parentWindowId);
		
		String childWindowId=iter.next();
		
		System.out.println("Child Window Id is:"+childWindowId);
		
		driver.switchTo().window(childWindowId);
		Thread.sleep(2000);
		
		System.out.println("Child Window Title is:"+driver.getTitle());
		
		driver.close();
		
		driver.switchTo().window(parentWindowId);
		Thread.sleep(2000);
		System.out.println("Parent Window Title is:"+driver.getTitle());
	}

}
