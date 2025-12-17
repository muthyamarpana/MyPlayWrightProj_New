package para;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class VerifyUpdate {

	@Test
	@Parameters({"con_string","un","pwd"})
	public void updateRecAndVerify(String connectionString,String uname,String passwd)
	{
		
		System.out.println("Record is Updated Successfully...");
		System.out.println(connectionString+"\t"+uname+"\t"+passwd);
	}
}
