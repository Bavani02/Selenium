package Seleniumtutorial;

import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class IrctcSignup {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://irctc.co.in");
		driver.manage().window().maximize();
		System.out.println("Url is success");
		
		driver.findElementByLinkText("Sign up").click();
		System.out.println("Signup page has success");
		driver.findElementById("userRegistrationForm:userName").sendKeys("Bavani");
		driver.findElementById("userRegistrationForm:password").sendKeys("Welcome123");
		driver.findElementById("userRegistrationForm:confpasword").sendKeys("Welcome123");
		System.out.println("UserName and password,confirm password has success");
		
		driver.findElementById("userRegistrationForm:securityQ").sendKeys("What is your pet name?");
		driver.findElementById("userRegistrationForm:securityAnswer").sendKeys("Cat");
		driver.findElementById("userRegistrationForm:prelan").sendKeys("English");
		System.out.println("Security Question answered has entered success");
		
		driver.findElementById("userRegistrationForm:firstName").sendKeys("Bavani");
		driver.findElementById("userRegistrationForm:middleName").sendKeys("Raji");
		driver.findElementById("userRegistrationForm:lastName").sendKeys("K");
		driver.findElementById("userRegistrationForm:gender:1").click();
		driver.findElementById("userRegistrationForm:maritalStatus:0").click();
		driver.findElementById("userRegistrationForm:maritalStatus:0").click();
		driver.findElementById("userRegistrationForm:dobDay").sendKeys("2");
		driver.findElementById("userRegistrationForm:dobMonth").sendKeys("4");
		driver.findElementById("userRegistrationForm:dateOfBirth").sendKeys("1987");
		driver.findElementById("userRegistrationForm:occupation").sendKeys("Private");
		driver.findElementById("userRegistrationForm:uidno").sendKeys("xxxxx");
		driver.findElementById("userRegistrationForm:idno").sendKeys("yyyyyy");
		driver.findElementById("userRegistrationForm:countries").sendKeys("India");
		driver.findElementById("userRegistrationForm:email").sendKeys("abcder@gmail.com");
		driver.findElementById("userRegistrationForm:mobile").sendKeys("23456789");
		driver.findElementById("userRegistrationForm:nationalityId").sendKeys("India");
		System.out.println("Personal detail has entered success");
		
		driver.findElementById("userRegistrationForm:address").sendKeys("11 A");
		driver.findElementById("userRegistrationForm:street").sendKeys("2nd street");
		driver.findElementById("userRegistrationForm:area").sendKeys("Adyar");
		driver.findElementById("userRegistrationForm:pincode").sendKeys("600020",Keys.TAB);
		Thread.sleep(5000);
		driver.findElementById("userRegistrationForm:cityName").sendKeys("Chennai");
		Thread.sleep(5000);

		driver.findElementById("userRegistrationForm:postofficeName").sendKeys("Adyar S.O (Chennai)");
		Thread.sleep(5000);

		driver.findElementById("userRegistrationForm:landline").sendKeys("34567779");
		driver.findElementById("userRegistrationForm:resAndOff:0").click();
		System.out.println("Residential address has entered success");

	}

}
