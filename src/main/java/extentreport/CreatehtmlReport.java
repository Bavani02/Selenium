package extentreport;

import java.io.File;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class CreatehtmlReport {
@Test
	public void report() 
	{
		//Step 1:create HTMl, false-mean no need to overwrite that mean append to previous report.
		ExtentReports reports= new ExtentReports("./reports/output.html",false);
		
		/*google--->type-->Extentreport config file--there open that particular link there download/copy
		that config file xml then come to project(eclipse)-->right click ->new->other->create xml and paste that config code(common location) to here-> 
		that is useful for change design what ever need */
		//Step 1a:Config xml to test
		File config=new File("./Selenium_bavani/Bavani_Selenium/Selenium/reporter_config.xml");
		reports.loadConfig(config);
		
		//Step 2: create a testcase
		ExtentTest test=reports.startTest("CreateLead");
		
		//Step 2a:Add author to test
		test.assignAuthor("Bavani");
		
		//Step 2b:Add testgroup to test
		test.assignCategory("smoke");
		
		//Step 3: Add a log status to the test
		test.log(LogStatus.PASS, "The browser has launched successfully");
		
		//Step 4:Add fail/warn the step
		test.log(LogStatus.FAIL, "user credentials wrongly entered");
		
		//Step 5:Add a step to close the test
		reports.endTest(test);
		
		//Step 6:Add a step to save the test
		reports.flush();
		
	
		
		
		
		
		
		

	}

}
