package testNGWithPlayWright;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DP_Exp {

	Object data[][];
	@DataProvider(name="data")
	public Object[][] setData()
	{
		data=new Object[3][2];
		data[0][0]="abc";
		data[0][1]="abc111";
		
		data[1][0]="raj";
		data[1][1]="raj444";
		
		data[2][0]="dev";
		data[2][1]="dev222";
		return data;
		
	}
	@Test(dataProvider = "data")
	public void login(String un,String pwd)
	{
		System.out.println(un+"\t"+pwd);
	}
	
}
