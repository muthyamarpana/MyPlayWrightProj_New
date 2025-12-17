package programs_new;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class TestProperties {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Logger log = Logger.getLogger(TestProperties.class);
		PropertyConfigurator.configure(".//src//test//resources//properties//Log4j2.properties");
		Properties prop = new Properties();
		FileInputStream fis=new FileInputStream(".//src//test//resources//properties//locators.properties");
		prop.load(fis);
		log.info("Locators Properties file loaded...");
		System.out.println(prop.get("browser"));
		log.info("Chrome Browser Launched...");
		System.out.println(prop.get("username_XPATH"));
		log.info("Entering UserName and Password..");
		log.info("Test Execution is Completed...");
		
	}

}
