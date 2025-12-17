package extentReportsDemo;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.SkipException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.Markup;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentReporter;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import extentListeners.ExtentListeners;

public class DemoOnExtentReport {

//	public ExtentSparkReporter htmlReporter;
//	//using this class we can create HTML file which shows the report and we can add the configuration also
//	public ExtentReports extent;
//	//this class is for attaching the reports to the tests and also allows to provide system configuration
//	public ExtentTest test; //allows to log the results as pass, fail, skip
//	
/*	@BeforeTest
	public void setReport()
	{
		htmlReporter = new ExtentSparkReporter("./reports/extent.html");
		htmlReporter.config().setEncoding("utf-8");
		htmlReporter.config().setDocumentTitle("Way to Automation Report");
		htmlReporter.config().setReportName("Automation Test Results");
		htmlReporter.config().setTheme(Theme.STANDARD);
		extent=new ExtentReports();
		extent.attachReporter(htmlReporter);
		extent.setSystemInfo("Automation Tester", "John");
		extent.setSystemInfo("Build No", "V.0.1");
		extent.setSystemInfo("Organization", "Automation Training");
			
	}
	*/
	@Test
	public void doLogin()
	{
		//test=extent.createTest("Login Test");
		ExtentListeners.test.log(Status.INFO, "Entering UserName");
		ExtentListeners.test.log(Status.INFO, "Entering Password");
		//test.pass("Test Case is Passed");
		
		
	}
	@Test
	public void doUserReg()
	{
		//test=extent.createTest("User Registration Test");
		ExtentListeners.test.log(Status.INFO, "Filling Form");
		//test.fail("Test is Failed");
		Assert.fail();
		
	}
	@Test
	public void skipTest()
	{
		//test=extent.createTest("Skip Test");
		ExtentListeners.test.log(Status.INFO, "Entering Some Data");
		//test.skip("Test is skipped");
		throw new SkipException("Skipping the test");
			
	}
	/*@AfterMethod
	public void updateResults(ITestResult result)
	{
		if(result.getStatus()==ITestResult.SUCCESS)
		{
			Markup m=MarkupHelper.createLabel("Test is Passed--"+result.getMethod().getMethodName(), ExtentColor.GREEN);
			test.pass(m);
		}
		else if(result.getStatus()==ITestResult.FAILURE)
		{
			Markup m=MarkupHelper.createLabel("Test is Failed", ExtentColor.RED);
			test.fail(m);
		}
		else if(result.getStatus()==ITestResult.SKIP)
		{
			Markup m=MarkupHelper.createLabel("Test is Skipped", ExtentColor.AMBER);
			test.skip(m);
		}
	}
	
	@AfterTest
	public void endReport()
	{
		extent.flush();
	}*/
}
