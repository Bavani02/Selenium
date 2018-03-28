package Seleniumtutorial;


import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LearningDropDown {

	public static void main(String[] args) throws InterruptedException 
	
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		
		//launch browser
		driver.get("http://irctc.co.in");
		driver.manage().window().maximize();
		System.out.println("Url is success");
		
		driver.findElementByLinkText("Sign up").click();
		System.out.println("Signup page has success");
		
		/*WebElement dropDown=driver.findElementById("userRegistrationForm:securityQ");
		Select secretQuestions=new Select(dropDown);
		
		List<WebElement> allQuestions=secretQuestions.getOptions();
		System.out.println(allQuestions.size());
		
		for(WebElement questions:allQuestions)
		{
			System.out.println(questions.getText());
		}
		Thread.sleep(3000);
		WebElement option=secretQuestions.getFirstSelectedOption();
		System.out.println("first select option is :"+option.getText());
		secretQuestions.selectByIndex(5);
		System.out.println("Value is :"+allQuestions.get(5).getText());
		Thread.sleep(2000);

		secretQuestions.selectByValue("7");
		
		Thread.sleep(2000);
		secretQuestions.selectByVisibleText("Who was your Childhood hero?");
		
		WebElement dropDown1=driver.findElementById("userRegistrationForm:prelan");

		Select preLang=new Select(dropDown1);
		List<WebElement> lang=preLang.getOptions();
		System.out.println("Preferred language is :"+lang.size());
		
		for(WebElement preferredLang:lang)
		{
			System.out.println(preferredLang.getText());
			
		}
*/	
		WebElement dropDown2=driver.findElementById("userRegistrationForm:countries");
		Select countries=new Select(dropDown2);
		List<WebElement> list=countries.getOptions();
		System.out.println("list of countries are :"+list.size());
		
		for(WebElement viewfulllist:list)
		{
			System.out.println(viewfulllist.getText());
		}
		Thread.sleep(2000);
		countries.selectByIndex(108);
		System.out.println(list.get(108).getText());
		
		countries.selectByValue("108");
		Thread.sleep(2000);
		countries.selectByVisibleText("India");
		Thread.sleep(2000);
		
		WebElement dropDown3=driver.findElementById("userRegistrationForm:nationalityId");
		Select nationality=new Select(dropDown3);
		List<WebElement> list1 =nationality.getOptions();
		Thread.sleep(2000);
		
		System.out.println(list1.size());
		//nationality.selectByIndex("7");
		nationality.selectByValue("240");
		
		for(WebElement fulllist:list)
		{
			System.out.println(fulllist.getText());
		}

		nationality.selectByVisibleText("India");
		
		driver.findElementById("userRegistrationForm:pincode").sendKeys("600032", Keys.TAB);
		
		WebElement dropDown4=driver.findElementById("userRegistrationForm:cityName");
		Select city=new Select(dropDown4);
		List<WebElement>list2=city.getOptions();
		
		for(WebElement fulllist:list2 )
		{
			System.out.println(fulllist.getText());
		}
		
		city.selectByIndex(1);
		System.out.println(list2.get(1).getText());
		
		driver.close();
		//driver.quit();

		}
	
		}
	
		


