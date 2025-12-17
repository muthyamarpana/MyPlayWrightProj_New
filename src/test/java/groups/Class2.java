package groups;

import org.testng.annotations.Test;

public class Class2 {

	@Test(groups= {"Functionality Testing"})
	public void test1()
	{
	System.out.println("this is Functionality Testing");	
	}
	@Test(groups= {"Functionality Testing"})
	public void test2()
	{
	System.out.println("this is Functionality Testing");	
	}
	@Test(groups= {"Sanity Testing"})
	public void test3()
	{
	System.out.println("this is Sanity Testing");	
	}
	@Test(groups= {"Regression Testing"})
	public void test4()
	{
	System.out.println("this is Regression Testing");	
	}
}
