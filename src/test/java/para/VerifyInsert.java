package para;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class VerifyInsert {

	//connection string
	//un and pwd
	@Test
	@Parameters({"con_string","un","pwd"})
	public void insertRecAndVerify(String connectionString,String uname,String passwd)
	{

		System.out.println("Record is Inserted Successfully...");
		System.out.println(connectionString+"\t"+uname+"\t"+passwd);
	}
}
