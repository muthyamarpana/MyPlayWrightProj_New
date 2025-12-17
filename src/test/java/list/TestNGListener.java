package list;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class TestNGListener implements ITestListener {

	@Override
	public void onTestSuccess(ITestResult result) {
		Reporter.log("Test is Passed-"+result.getName());
	}

	@Override
	public void onTestFailure(ITestResult result) {
		Reporter.log("Test is Failed-"+result.getName());
	}

	
}
