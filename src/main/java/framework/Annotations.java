package framework;

import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

public class Annotations extends SeMethods {

	@BeforeSuite
	public  void beforeSuite() {

	}

	@BeforeTest
	public  void beforeTest() {

	}

	@BeforeClass
	public  void beforeClass() {

	}

	@Parameters({"browser","url","username","password"})
	@BeforeMethod
	public  void beforeMethod(String browser,String url,String username,String password ) {

		//navigate to url
		startApp(browser,url);


		//Passing value to login page
		WebElement user = locateElement("id", "username");
		type(user, username);


		WebElement pwd = locateElement("id", "password");
		type(pwd, password);

		WebElement login = locateElement("class", "decorativeSubmit");
		click(login);

		//navigate to CRM/SFA
		WebElement crm = locateElement("link", "CRM/SFA");
		click(crm);


	}

	@AfterMethod
	public  void afterMethod() {
		
		closeBrowser();

	}

	@AfterClass
	public  void afterClass() {

	}

	@AfterTest
	public  void afterTest() {

	}

	@AfterSuite
	public  void afterSuite() {
		

	}






}
