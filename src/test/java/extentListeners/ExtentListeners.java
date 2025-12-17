package extentListeners;

import java.util.Date;

import org.testng.ISuite;
import org.testng.ISuiteListener;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.Markup;
import com.aventstack.extentreports.markuputils.MarkupHelper;

public class ExtentListeners implements ITestListener,ISuiteListener
{
	
	static Date d = new Date(); //hold current system date
	static String fileName = "Extent "+d.toString().replace(":", "_").replace(" ", "_")+".html";
	private static ExtentReports extent = ExtentManager.createInstance(".\\reports\\"+ fileName);
	public static ExtentTest test;
	@Override
	public void onTestStart(ITestResult result) {
		//test=extent.createTest(result.getTestClass().getName()+" @TestCase "+result.getMethod().getMethodName());
		test=ExtentManager.extent.createTest(result.getTestClass().getName()+" @TestCase "+result.getMethod().getMethodName());
	}
	@Override
	public void onTestSuccess(ITestResult result) {
		String methodName=result.getMethod().getMethodName();
		String logText="<b>"+"TEST CASE:="+methodName.toUpperCase()+" PASSED";
		Markup m = MarkupHelper.createLabel(logText, ExtentColor.GREEN);
		test.pass(m);
	}
	@Override
	public void onTestFailure(ITestResult result) {
		String methodName=result.getMethod().getMethodName();
		String logText="<b>"+"TEST CASE:="+methodName.toUpperCase()+" FAILED";
		Markup m = MarkupHelper.createLabel(logText, ExtentColor.RED);
		test.log(Status.FAIL, m);
	}
	@Override
	public void onTestSkipped(ITestResult result) {
		String methodName=result.getMethod().getMethodName();
		String logText="<b>"+"TEST CASE:="+methodName.toUpperCase()+" SKIPPED";
		Markup m = MarkupHelper.createLabel(logText, ExtentColor.AMBER);
		test.skip(m);

	}
	
	@Override
	public void onFinish(ITestContext context) {
		if(extent!=null)
		{
			extent.flush();
		}
	}
//	@Override
//	public void onStart(ISuite suite) {
//		// TODO Auto-generated method stub
//		ISuiteListener.super.onStart(suite);
//	}
	
	

}
