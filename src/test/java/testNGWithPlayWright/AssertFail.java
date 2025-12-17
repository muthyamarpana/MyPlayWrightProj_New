package testNGWithPlayWright;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertFail {

	@Test(priority=1)
	public void doUserReg()
	{
		System.out.println("Executing User Registration");
		//Assert.fail("User not Registered Successfully...");
	}
	
	@Test(priority=2,dependsOnMethods = "doUserReg",alwaysRun = true)
	public void doLogin()
	{
		System.out.println("Executing Login Test");
	}
	
	@Test(priority=3)
	public void firstTest()
	{
		System.out.println("This is my First Test...");
	}
	
	@Test(priority=4,dependsOnMethods = {"doUserReg","firstTest"})
	public void SecondTest()
	{
		System.out.println("This is my Second Test...");
	}
}
