package Seleniumtutorial;

import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumFirstClass {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps");
		driver.manage().window().maximize();
		System.out.println("Application lauched");
		driver.findElementById("username").sendKeys("DemoSalesManager");
		System.out.println("Username is success");
		driver.findElementById("password").sendKeys("crmsfa");
		System.out.println("Password is success");
		driver.findElementByClassName("decorativeSubmit").click();
		System.out.println("Login has success");
		driver.findElementByLinkText("CRM/SFA").click();
		System.out.println("CRM/SFA has success");
		driver.findElementByLinkText("Create Lead").click();
		System.out.println("Create Lead has success");
		driver.findElementById("createLeadForm_companyName").sendKeys("Amazon");
		driver.findElementById("createLeadForm_firstName").sendKeys("Bavani");
		driver.findElementById("createLeadForm_dataSourceId").sendKeys("Conference");
		driver.findElementById("createLeadForm_firstNameLocal").sendKeys("Welcome");
		driver.findElementById("createLeadForm_personalTitle").sendKeys("ABCD");
		driver.findElementById("createLeadForm_generalProfTitle").sendKeys("EFGH");
		driver.findElementById("createLeadForm_annualRevenue").sendKeys("1000");
		driver.findElementById("createLeadForm_industryEnumId").sendKeys("Computer Hardware");
		driver.findElementById("createLeadForm_ownershipEnumId").sendKeys("Partnership");
		driver.findElementById("createLeadForm_sicCode").sendKeys("34567");
		driver.findElementById("createLeadForm_description").sendKeys("abcedeerafaergddrerafaeee");
		driver.findElementById("createLeadForm_importantNote").sendKeys("abcedeerafaergddreadferrafaeee");
		driver.findElementById("createLeadForm_primaryPhoneCountryCode").sendKeys("45");
		driver.findElementById("createLeadForm_primaryPhoneAreaCode").sendKeys("065");
		driver.findElementById("createLeadForm_primaryPhoneExtension").sendKeys("346");
		driver.findElementById("createLeadForm_primaryEmail").sendKeys("dfafdad@gmail.com");
		driver.findElementById("createLeadForm_generalToName").sendKeys("BBBBB");
		driver.findElementById("createLeadForm_generalAddress1").sendKeys("11 c, garden street");
		driver.findElementById("createLeadForm_generalCity").sendKeys("Delhi");
		driver.findElementById("createLeadForm_generalPostalCode").sendKeys("23455");
		driver.findElementById("createLeadForm_generalPostalCodeExt").sendKeys("245");
		driver.findElementById("createLeadForm_parentPartyId").sendKeys("adadf");
		driver.findElementById("createLeadForm_lastName").sendKeys("detrt");
		driver.findElementById("createLeadForm_marketingCampaignId").sendKeys("Automobile");
		driver.findElementById("createLeadForm_lastNameLocal").sendKeys("dethr");
		driver.findElementById("createLeadForm_birthDate").sendKeys("11/15/2017");
		driver.findElementById("createLeadForm_departmentName").sendKeys("Automation Testing");
		driver.findElementById("createLeadForm_currencyUomId").sendKeys("INR - Indian Rupee");
		driver.findElementById("createLeadForm_numberEmployees").sendKeys("40");
		driver.findElementById("createLeadForm_tickerSymbol").sendKeys("40");
		driver.findElementById("createLeadForm_primaryPhoneNumber").sendKeys("34656789");
		driver.findElementById("createLeadForm_primaryPhoneAskForName").sendKeys("Purpose");
		driver.findElementById("createLeadForm_primaryWebUrl").sendKeys("www.google.com");
		driver.findElementById("createLeadForm_generalAttnName").sendKeys("adfdr");
		driver.findElementById("createLeadForm_generalAddress2").sendKeys("Trichy");
		driver.findElementById("createLeadForm_generalStateProvinceGeoId").sendKeys("NEW DELHI");
		driver.findElementById("createLeadForm_generalCountryGeoId").sendKeys("India");
		driver.findElementByClassName("smallSubmit").click();
	

		
	}

}
