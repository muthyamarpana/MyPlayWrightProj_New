package testNGWithPlayWright;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertExp {

	@Test(description="Hard Assert",priority=1,enabled=false)
	public void compareInt()
	{
		Assert.assertEquals(10, 20);
		System.out.println("Assert Executed..");
		
	}
	
	@Test(description="Soft Assert",priority=2)
	public void compareFloat()
	{
		SoftAssert assertion = new SoftAssert();
		assertion.assertEquals(10.2, 10.2);
		System.out.println("Assert Executed..");
		assertion.assertEquals(10.2, 10.2);
		assertion.assertAll();
		
	}
	
	
}
