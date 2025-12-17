package testNGWithPlayWright;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestCase1 {
	@BeforeTest
	public void beforetest()
	{
		System.out.println("This test executes before test");
	}
	@AfterTest
	public void AfterTest()
	{
		System.out.println("This test executes after test");
	}
	@BeforeClass
	public void beforeClass()
	{
		System.out.println("This test executes before class");
	}
	@AfterClass
	public void afterClass()
	{
		System.out.println("This test executes after class");
	}
	
	@BeforeMethod
	public void beforeMethod()
	{
		System.out.println("This test executes before method..");
	}
	@AfterMethod
	public void afterMethod()
	{
		System.out.println("This test executes after method..");
	}
	@Test(description="Test1",priority=1)
	public void test1()
	{
		System.out.println("This is my First Test Case...");
	}
	@Test(description="Test2",priority=2)
	public void test2()
	{
		System.out.println("This is my Second Test Case...");
	}
	@Test(description="Launch Chrome",priority=3)
	public void LaunchRediff()
	{
		System.out.println("This is my Third Test Case...");
	}
	@Test(description="Login Rediff",priority=4)
	public void LoginRediff()
	{
		System.out.println("This is my Fourth Test Case...");
	}
	@Test(description="Close Browser",priority=5)
	public void CloseRediff()
	{
		System.out.println("This is my Fifth Test Case...");
	}
}
