package list;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(list.TestNGListener.class)
public class Test1 {

	@Test
	public void compareInt()
	{
		Assert.assertEquals(10, 10);
	}

	@Test
	public void compareFloat()
	{
		Assert.assertEquals(10.3, 10.7);
	}
}
